package com.zking.controller;

import com.alibaba.fastjson.JSON;
import com.zking.model.Cclass;
import com.zking.service.CclassService;
import com.zking.util.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CclassController {
    @Autowired
    CclassService cclassService;
    @ResponseBody
    @RequestMapping(value = "/getAllCclass",produces="application/json;charset=UTF-8")
    public String getAllCclass(){
        List<Cclass> cclasses =  cclassService.findAllCclass();
        Layui l = Layui.data(cclasses.size(), cclasses);
        return JSON.toJSONString(l);
    }
}
