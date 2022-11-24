package ltd.oyqf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class application_7001 {
    public static void main(String[] args) {
        SpringApplication.run(application_7001.class,args);
    }
}
