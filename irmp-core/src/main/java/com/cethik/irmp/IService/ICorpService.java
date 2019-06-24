/*
 * Copyright 2012-2018 CETHIK CETITI All Rights Reserved.
 */

package com.cethik.irmp.IService;

import com.cethik.irmp.mapper.CorpMapper;
import com.cethik.irmp.model.Corp;
import com.cethik.irmp.service.BaseService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Corp service
 *
 * @author zhongping@hikchina.com
 * @date 2018-08-31
 */

public interface ICorpService {


    public void create(Corp model) throws Exception;

    public void edit(Corp model);


    public Corp detail(Integer id);

    public void delete(Integer id);

    public void deleteBatch(String ids);

    public List<Corp> selectAll();

    public List<Corp> selectListByPage(int pageNum, int pageSize);
}
