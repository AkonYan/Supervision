/*
 * Copyright 2012-2018 CETHIK CETITI All Rights Reserved.
 */

package com.cethik.irmp.IService;

import com.cethik.irmp.mapper.RoleMapper;
import com.cethik.irmp.model.Role;
import com.cethik.irmp.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Role service
 *
 * @author zhongping@hikchina.com
 * @date 2018-08-31
 */
public interface IRoleService{

    public void create(Role model) throws Exception;

    public void edit(Role model);


    public Role detail(Integer id);

    public void delete(Integer id);

    public void deleteBatch(String ids);

    public List<Role> selectAll();

    public List<Role> roleList(String account);

    public List<Role> selectByParent(Integer pid);

    public List<Role> selectByProgId(Integer progid);
}
