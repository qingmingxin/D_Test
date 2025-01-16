package com.qingmingxin.pojo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DatanodeMetadata {
    @NotNull(message = "节点ID不能为空")
    private Long nodeId; // 数据节点的唯一标识符

    @NotBlank(message = "节点名称不能为空")
    private String nodeName; // 数据节点的名称

    @NotBlank(message = "IP 地址不能为空")
    private String ipAddress; // 数据节点所在服务器的IP地址

    @NotNull(message = "CPU 核心数不能为空")
    private Integer cpuCores; // CPU核心数

    @NotNull(message = "内存大小不能为空")
    private Long memorySize; // 内存大小（单位：字节）

    @NotNull(message = "存储大小不能为空")
    private Long storageSize; // 存储大小（单位：字节）

    private Long usedMemory; // 已使用内存（单位：字节）

    private Long usedStorage; // 已使用存储（单位：字节）

    @NotBlank(message = "根目录不能为空")
    private String rootDirectory; // 数据节点存放的根目录

    @NotBlank(message = "公钥不能为空")
    private String publicKey;
}
