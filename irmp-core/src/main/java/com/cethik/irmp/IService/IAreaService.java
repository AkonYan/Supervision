package com.cethik.irmp.IService;

import com.cethik.irmp.mapper.AreaMapper;
import com.cethik.irmp.model.Area;
import com.cethik.irmp.service.BaseService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Area service
 *
 * @author zhongping@hikchina.com
 * @date 2018-08-31
 */


public interface IAreaService{
    public void create(Area model) throws Exception;

    public void edit(Area model);

    public Area detail(Integer id);

    public void delete(Integer id);

    public void deleteBatch(String ids);

    public List<Area> selectAll();

    public List<Area> selectListByPage(int pageNum, int pageSize);
}
