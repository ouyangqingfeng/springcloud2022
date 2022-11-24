package ltd.oyqf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 */
@EnableEurekaClient
@MapperScan(basePackages = "ltd.oyqf.mapper")
@SpringBootApplication
public class application_8001 {
    public static void main(String[] args) {
        SpringApplication.run(application_8001.class,args);
    }
}
