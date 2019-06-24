package com.cethik.irmp.controller;

import com.cethik.irmp.IService.IDictionaryDataService;
import com.cethik.irmp.dto.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(value = "dictionaryData")
public class DictionaryDataController extends BaseController{
    private static final Logger logger = LoggerFactory
            .getLogger(DictionaryDataController.class);

    private IDictionaryDataService dictionaryDataService;

    @RequestMapping(value = "/getDictionaryDataById", method = RequestMethod.GET)
    public BaseResponse<?> getDictionaryData(HttpServletRequest request) throws Throwable {
        String ids = request.getParameter("ids");
        String[] s=ids.split(",");
        List m=Arrays.asList(s);
        dictionaryDataService.QueryDictionDataList(m);
        return BaseResponse.buildSuccessResponse(null);
    }
}
