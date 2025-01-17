package com.qingmingxin.controller;

import com.qingmingxin.pojo.DatanodeMetadata;
import com.qingmingxin.service.DatanodeMetadataService;
import com.qingmingxin.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datanode")
public class DatanodeMetadataController {

    @Autowired
    private DatanodeMetadataService datanodeMetadataService;

    @PostMapping("/register")
    public Result register(@RequestBody @Validated({DatanodeMetadata.Register.class}) DatanodeMetadata datanodeMetadata) {
        datanodeMetadataService.register(datanodeMetadata);
        return Result.success();
    }
}
