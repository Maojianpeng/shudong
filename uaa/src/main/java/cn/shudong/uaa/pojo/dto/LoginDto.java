package cn.shudong.uaa.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 用户登录参数
 *
 * @author zhouqi
 * @version v1.0.0
 * @date 2020/5/27 17:45
 * @Description
 */
@ApiModel(description = "用户登录参数")
@Data
public class LoginDto {

    /**
     * 用户名
     * 即 员工号
     */
    @ApiModelProperty(value = "用户名", notes = "用户名只允许为大小写英文和数字, 且长度在6-16位之间")
    @NotBlank(message = "请输入用户名")
    @Pattern(regexp = "^[a-zA-Z0-9]{6,16}$", message = "用户名只允许为大小写英文和数字, 且长度在6-16位之间")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码: 密码必须包含字母和数字, 且长度在6-16位之间")
    @NotBlank(message = "请输入密码")
    @Pattern(regexp = "^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z\\\\W]{6,16}$", message = "密码必须包含字母和数字, 且长度在6-16位之间")
    private String password;

}
