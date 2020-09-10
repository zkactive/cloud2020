package cn.zk.springcloud.controller;

import cn.zk.springcloud.entities.CommonResult;
import cn.zk.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zk
 * @version 1.0
 * @description springcloud整合consul 服务消费者
 * @date 2020/9/9 15:22
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL="http://consul-provider-payment";

    @Resource
    public RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String payment(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
        return result;
    }
}