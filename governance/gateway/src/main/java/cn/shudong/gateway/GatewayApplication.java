package cn.shudong.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 网关启动类
 * @author zhouqi
 * @date 2020/11/20 15:19
 * @version v1.0.0
 * @Description
 *
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"cn.shudong"})
public class GatewayApplication {



    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
        log.info("============================ Gateway * System startup completed ===================================================");
    }

}
