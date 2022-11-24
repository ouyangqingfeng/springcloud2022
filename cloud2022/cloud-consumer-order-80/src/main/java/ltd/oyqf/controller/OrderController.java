package ltd.oyqf.controller;

import lombok.extern.slf4j.Slf4j;
import ltd.oyqf.entitles.CommonResult;
import ltd.oyqf.entitles.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    public static final String PAY_MENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAY_MENT_URL+"/payment/create",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getByid(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAY_MENT_URL+"/payment/get/"+id,CommonResult.class);
    }


}
