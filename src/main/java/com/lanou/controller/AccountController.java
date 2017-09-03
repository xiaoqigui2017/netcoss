package com.lanou.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Account;
import com.lanou.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.java2d.pipe.AAShapePipe;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AccountController {

    @Resource
    private AccountService accountService;

    //    跳转到account/account_list页面Timestamp
    @RequestMapping(value = "/account_list")
    public String account_list() {
        return "account/account_list";
    }

    //把分页account信息显示在account/account_list页面上
    @RequestMapping(value = "/account_pagelist")
    @ResponseBody
    public Map<String, Object> account_pagelist(@RequestParam("PageNumber") Integer PageNumber,
                                                @RequestParam("pageSize") Integer pageSize) {
        PageInfo<Account> pageInfo = accountService.findAllPage(PageNumber, pageSize);
        System.out.println(pageInfo);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("pageInfo", pageInfo);


        return map;
    }




}
