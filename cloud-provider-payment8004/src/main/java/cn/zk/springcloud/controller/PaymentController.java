package cn.zk.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author zk
 * @version 1.0
 * @description springcloud整合zookeeper
 * @date 2020/9/1 17:45
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentzk() {
        return "springcloud with zookeeper port:" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
