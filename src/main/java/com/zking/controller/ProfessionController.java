package com.zking.controller;

import com.alibaba.fastjson.JSON;
import com.zking.model.Profession;
import com.zking.service.ProfessionService;
import com.zking.util.Layui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProfessionController {
    @Autowired
    ProfessionService professionService;

    @ResponseBody
    @RequestMapping(value = "/getAllProfession",produces="application/json;charset=UTF-8")
    public String getAllProfession(){
        List<Profession> professions = professionService.findAllProfession();
        Layui l = Layui.data(professions.size(), professions);
        return JSON.toJSONString(l);
    }
}
