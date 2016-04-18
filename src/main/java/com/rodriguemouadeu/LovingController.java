package com.rodriguemouadeu;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LovingController {

    private static final String template = "I love you %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/loving")
    public Loving loving(@RequestParam(value="name", defaultValue="World") String name) {
        return new Loving(String.format(template, name));
    }
}
