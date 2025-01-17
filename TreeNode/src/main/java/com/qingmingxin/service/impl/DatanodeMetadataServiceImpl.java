package com.qingmingxin.service.impl;

import com.qingmingxin.mapper.DatanodeMetadataMapper;
import com.qingmingxin.pojo.DatanodeMetadata;
import com.qingmingxin.service.DatanodeMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatanodeMetadataServiceImpl implements DatanodeMetadataService {

    @Autowired
    private DatanodeMetadataMapper datanodeMetadataMapper;

    @Override
    public void register(DatanodeMetadata datanodeMetadata) {

    }
}