package com.wxd.mvcdemo.service.impl;

import com.wxd.mvcdemo.entity.EmpInfo;
import com.wxd.mvcdemo.mapper.EmpInfoMapper;
import com.wxd.mvcdemo.service.EmpInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
//@Transactional
public class EmpInfoServiceImpl implements EmpInfoService {

    @Autowired
    private EmpInfoMapper mapper;
    @Override
    public List<EmpInfo> list() {
        return mapper.selectAll();
    }
}
