package com.zking.controller;

import com.zking.util.MyTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CommonController {
    private final Logger log =  LoggerFactory.getLogger(CommonController.class);
    @RequestMapping("/{pageName}")
    public String pathAll(@PathVariable(value="pageName") String pageName){
        return pageName;
    }

    @RequestMapping(value = "/uploadImg", method = RequestMethod.POST)
    public @ResponseBody Object updatePersonal(@RequestParam("photo") MultipartFile file, HttpServletRequest request)
            throws IllegalStateException, IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        String name = System.currentTimeMillis() + "_" + file.getOriginalFilename();

        String imgAbsolutePath = MyTool.SaveImg(file, MyTool.getImg(), name);
        map.put("code", 0);
        map.put("message", "上传成功");
        map.put("data", name);
        return map;
    }

    @RequestMapping("/loginOut")
    public String loginOut(HttpSession httpSession) {
        httpSession.removeAttribute("user");
        return "redirect:/";
    }
}
