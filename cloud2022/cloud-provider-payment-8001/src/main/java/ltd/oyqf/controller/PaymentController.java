package ltd.oyqf.controller;

import lombok.extern.slf4j.Slf4j;
import ltd.oyqf.entitles.CommonResult;
import ltd.oyqf.entitles.Payment;
import ltd.oyqf.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult<Payment> create(Payment payment){
        int i = paymentService.create(payment);
        log.info("插入数据");
        if (i > 0){
            return new CommonResult<>(200,"使用8001创建成功",payment);
        }else {
            return new CommonResult<>(404,"使用8001创建失败",payment);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getByid(@PathVariable("id") Long id){
        log.info("id = " + id);
        Payment payment = paymentService.getPaymentById(id);
        if (payment == null){
            return new CommonResult<>(404,"使用8001查询失败",payment);
        }
        return new CommonResult<>(200,"使用8001查询成功",payment);
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout(){
        try { TimeUnit.SECONDS.sleep(3); }catch (Exception e) {e.printStackTrace();} //单位秒
        return "8001";
    }

    @GetMapping("/payment/zipkin")
    public String paymentZipkin(){
        return "hi ,i'am paymentzipkin server，welcome to oyqf.ltd，O(∩_∩)O哈哈~";
    }



}
