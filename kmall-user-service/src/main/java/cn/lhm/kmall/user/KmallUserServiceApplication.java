package cn.lhm.kmall.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@MapperScan("cn.lhm.kmall.user.mapper")
@SpringBootApplication
public class KmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KmallUserServiceApplication.class, args);
    }

}
