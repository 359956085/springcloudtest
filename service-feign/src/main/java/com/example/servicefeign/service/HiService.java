package com.example.servicefeign.service;

import com.example.servicefeign.service.Hystric.HiServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(value = "service-hi", fallback = HiServiceHystric.class)
public interface HiService {

    @RequestMapping(value = "/hi")
    String sayHiFromClient(@RequestParam("name") String name);
}
