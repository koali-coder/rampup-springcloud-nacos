package com.demo.client.controller;

import com.demo.client.model.RestData;
import com.demo.client.service.AdminApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client" )
public class ClientController {

    @Autowired
    AdminApi adminApi;

    @GetMapping("/hello" )
    public RestData hello() {
        return RestData.success("client");
    }

    @GetMapping("/hello2" )
    public RestData hello2() {
        return adminApi.helloServer();
    }

}
