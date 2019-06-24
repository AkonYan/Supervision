/*
 * Copyright 2012-2018 CETHIK CETITI All Rights Reserved.
 */

package com.cethik.irmp.IService;

import com.cethik.irmp.mapper.DictionaryInfoMapper;
import com.cethik.irmp.model.DictionaryInfo;
import com.cethik.irmp.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * DictionaryInfo service
 *
 * @author zhongping@hikchina.com
 * @date 2018-08-31
 */

public interface IDictionaryInfoService  {

    public List<DictionaryInfo> selectAll();

    public List<DictionaryInfo> selectByCode(String code);


}
