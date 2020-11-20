package cn.shudong.uaa;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * UAA 启动类
 *
 * @author zhouqi
 * @version v1.0.0
 * @date 2020/5/21 10:48
 * @Description Modification History:
 * Date                 Author          Version          Description
 * ---------------------------------------------------------------------------------*
 * 2020/5/21 10:48     zhouqi          v1.0.0           Created
 */
@Slf4j
@SpringBootApplication(scanBasePackages = "cn.shudong")
@MapperScan(basePackages = "cn.shudong.uaa.dao")
public class UaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UaaApplication.class, args);
        log.info("============================ UAA * System startup completed ===================================================");
    }
}
