package com.av.vedio.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.av.vedio.entity.TbItem;
import com.av.vedio.provider.AvVedioProvider;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(value = "我的控制类")
@Controller
public class MyController {

    @Reference(version = "1.0.0")
    private AvVedioProvider avVedioProvider;

    @ApiOperation(value = "查询接口")
    @RequestMapping("/findAllTbItem")
    @ResponseBody
    public List<TbItem> findAllTbItem(){
        return avVedioProvider.findAllTbItem();
    }

    @RequestMapping("/")
    public String loginPage() {
        return "/home_page";
    }

    @RequestMapping("/login")
    public String toLogin(String username, String password) {
        System.out.println(username + "-------" + password);
        return "login";
    }
}
