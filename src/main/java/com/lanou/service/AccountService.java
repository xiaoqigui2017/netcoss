package com.lanou.service;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Account;

import java.util.List;

/**
 * Created by dllo on 17/9/3.
 */
public interface AccountService {

    PageInfo<Account> findAllPage(Integer pageNum, Integer pageSize);


    List<Account> findAll();
}
