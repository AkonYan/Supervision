/*
 * Copyright 2012-2018 CETHIK CETITI All Rights Reserved.
 */

package com.cethik.irmp.IService;

import com.cethik.irmp.mapper.UserMapper;
import com.cethik.irmp.model.UserInfo;
import com.cethik.irmp.service.BaseService;
import com.cethik.irmp.vmodel.CurrentUser;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User service
 *
 * @author zhongping@hikchina.com
 * @date 2018-08-31
 */

public interface IUserService{

    public void create(UserInfo model) throws Exception ;

    public void edit(UserInfo model);

    public UserInfo detail(Integer id);

    public void delete(String account);

    public void deleteBatch(String ids);


    public List<UserInfo> selectAll();

    public List<UserInfo> selectByRoleId(Integer roleId);

    public boolean verifyLogin(UserInfo user);

    public UserInfo selectByAccount(String account);

    public CurrentUser loginByAccount(String account);

    public List<UserInfo> selectListByPage(int pageNum, int pageSize);
}
