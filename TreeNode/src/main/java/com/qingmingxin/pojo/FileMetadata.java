package com.qingmingxin.pojo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class FileMetadata {
    @NotNull(message = "ID 不能为空")
    private Long id; // 唯一标识符，自动递增

    @NotBlank(message = "名称不能为空")
    @Size(max = 255, message = "名称长度不能超过 255 个字符")
    private String name; // 文件或目录的名称

    @NotBlank(message = "路径不能为空")
    @Size(max = 512, message = "路径长度不能超过 512 个字符")
    private String path; // 文件或目录的完整路径

    private Long parentId; // 指向父目录的ID，根目录为NULL

    @NotNull(message = "类型不能为空")
    private String type; // 文件类型，file或dir

    @NotNull(message = "大小不能为空")
    private Long size; // 文件大小，目录大小为0

    @NotBlank(message = "哈希值不能为空")
    @Size(max = 64, message = "哈希值长度不能超过 64 个字符")
    private String hashValue; // 文件内容的哈希值，保证唯一性

    @NotNull(message = "数据节点ID不能为空")
    private Long dataNodeId; // 关联的数据节点ID

    @NotNull(message = "创建时间不能为空")
    private LocalDateTime creationTime; // 创建时间

    @NotNull(message = "最后修改时间不能为空")
    private LocalDateTime modificationTime; // 最后修改时间
}
