package cn.shudong.uaa.web;

import cn.shudong.core.wrapper.GlobalResponseWrapper;
import cn.shudong.uaa.pojo.dto.LoginDto;
import cn.shudong.uaa.pojo.vo.LoginVo;
import cn.shudong.uaa.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 普通用户
 *
 * @author zhouqi
 * @version v1.0.0
 * @date 2020/11/20 16:32
 * @Description
 */
@Api(tags = "用户")
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private LoginService loginService;


    @ApiOperation(value = "用户登录")
    @PostMapping("login")
    public LoginVo login(@Valid @RequestBody LoginDto loginDto) {
        LoginVo loginVo = this.loginService.login(loginDto.getUsername(), loginDto.getPassword());
        return loginVo;
    }


}
