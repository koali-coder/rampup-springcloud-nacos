package com.demo.client.service;

import com.demo.client.model.RestData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "rampup-admin")
public interface AdminApi {

    @GetMapping("/admin/hello")
    RestData helloServer();

}
