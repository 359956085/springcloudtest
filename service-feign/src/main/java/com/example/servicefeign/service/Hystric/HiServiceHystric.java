package com.example.servicefeign.service.Hystric;

import com.example.servicefeign.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiServiceHystric implements HiService {

    @Override
    public String sayHiFromClient(String name) {
        return name + " : error";
    }
}
