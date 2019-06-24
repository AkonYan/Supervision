/*
 * Copyright 2012-2018 CETHIK CETITI All Rights Reserved.
 */

package com.cethik.irmp.IService;

import com.cethik.irmp.mapper.SystemlogMapper;
import com.cethik.irmp.model.Systemlog;
import com.cethik.irmp.service.BaseService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Systemlog service
 *
 * @author zhongping@hikchina.com
 * @date 2018-12-05
 */

public interface ISystemlogService{


    public void create(Systemlog model) throws Exception ;

    public void edit(Systemlog model);

    public Systemlog detail(Integer id);

    public List<Systemlog> selectAll();

    public List<Systemlog> selectListByPage(int pageNum, int pageSize);
}
