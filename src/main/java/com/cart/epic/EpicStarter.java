package com.cart.epic;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class EpicStarter {

    @GetMapping("/epic")
    public String echoMsg(@RequestParam String param) {

        return "Welcome to Project Epic [" + param + "], Dude you journey's gonna be epilicious...!";

    }
}