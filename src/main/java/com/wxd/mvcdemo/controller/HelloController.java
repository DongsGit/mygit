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
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private EmpInfoService service;

    @RequestMapping("/mvc")
    public String helloMvc(){
        return "empInfo";
    }

    @RequestMapping("/list")
    @ResponseBody
    public MyView list(HttpServletResponse response, String page, String limit){
//      以UTF-8 方式 响应数据，并提醒浏览器 以这种方式 阅读
        response.setContentType("text/html;charset=UTF-8");
//        PageHelper.startPage(Integer.parseInt(page), Integer.parseInt(limit));
        List<EmpInfo> list = service.list();
//        PageInfo<EmpInfo> pageInfo = new PageInfo<>(list);
        return new MyView(0,"ok",3,list);
    }
}
