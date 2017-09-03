package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.bean.Account;

import com.lanou.mapper.AccountMapper;
import com.lanou.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper mapper;


    public PageInfo<Account> findAllPage(Integer pageNum, Integer pageSize) {
        pageNum = pageNum == null ? 1 : pageNum;
        pageSize = pageSize == null ? 3 : pageSize;
        PageHelper.startPage(pageNum,pageSize);
        List<Account> accountList = mapper.findAll();
        PageInfo<Account> pageInfo = new PageInfo<Account>(accountList);
        return pageInfo;
    }

    public List<Account> findAll() {
        return mapper.findAll();
    }


}
