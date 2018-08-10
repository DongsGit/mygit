package com.wxd.mvcdemo.controller;

import com.wxd.mvcdemo.entity.EmpInfo;
import com.wxd.mvcdemo.entity.MyView;
import com.wxd.mvcdemo.service.EmpInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
@RequestMapping("/empInfo")
public class EmpInfoController {
    @Autowired
    private EmpInfoService service;

    @RequestMapping("/showMain")
    public String showMain(){
        return "main";
    }

    @RequestMapping("/showEmpInfo")
    public String showEmpInfo(){
        return "empInfo";
    }

    @RequestMapping("/list")
    @ResponseBody
    public MyView list(HttpServletResponse response, String page, String limit){
//      以UTF-8 方式 响应数据，并提醒浏览器 以这种方式 阅读
        response.setContentType("text/html;charset=UTF-8");
        List<EmpInfo> list = service.list();
        int countEmpInfo = service.countEmpInfo();
        return new MyView(0,"ok",countEmpInfo,list);
    }

}
