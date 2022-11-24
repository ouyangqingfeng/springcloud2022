package ltd.oyqf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class application_hystrix_8001 {
    public static void main(String[] args) {
        SpringApplication.run(application_hystrix_8001.class,args);
    }
}
