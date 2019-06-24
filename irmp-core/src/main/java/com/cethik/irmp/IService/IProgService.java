/*
 * Copyright 2012-2018 CETHIK CETITI All Rights Reserved.
 */

package com.cethik.irmp.IService;

import com.cethik.irmp.mapper.ProgMapper;
import com.cethik.irmp.model.Prog;
import com.cethik.irmp.service.BaseService;
import com.cethik.irmp.vmodel.Nestable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Prog service
 *
 * @author suzhaoyang@cetiti.com
 * @date 2018-08-31
 */

public interface IProgService{


    public void create(Prog model) throws Exception;

    public void edit(Prog model);

    public Prog detail(Integer id);

    public void delete(Integer id);

    public List<Prog> selectAll();

    public List<Prog> selectByRoleId(Integer roleId);

    public List<Prog> selectByUserId(Integer userId);

    public void sort(List<Nestable> nestables, int parentID);

}
