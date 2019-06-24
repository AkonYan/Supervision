package com.cethik.irmp.service;

import com.cethik.irmp.IService.IDictionaryDataService;
import com.cethik.irmp.annotition.CetcLog;
import com.cethik.irmp.aspect.OPERATE;
import com.cethik.irmp.mapper.DictionaryDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class DictionaryDataService extends BaseService implements IDictionaryDataService {

    @Autowired
    private DictionaryDataMapper mapper;

    @CetcLog(type= OPERATE.QUERY,info="查询所有的列表")
    public List QueryDictionDataList(List ids){
        List<Map<String,Object>> list = mapper.QueryDictionDataList(ids);
        return list;
    }

}
