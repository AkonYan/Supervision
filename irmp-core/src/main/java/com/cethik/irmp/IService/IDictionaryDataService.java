package com.cethik.irmp.IService;

import com.cethik.irmp.annotition.CetcLog;
import com.cethik.irmp.aspect.OPERATE;
import com.cethik.irmp.mapper.DictionaryDataMapper;
import com.cethik.irmp.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface IDictionaryDataService{

    public List QueryDictionDataList(List ids);
}
