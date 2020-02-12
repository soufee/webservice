package ru.ashamaz.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;

@Controller
@RequestMapping(value = "/")
public class MainController {
    static final Logger log = LogManager.getLogger(MainController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String showHelloPage() {
        log.info("showHelloPage = "+ new File(System.getProperty("user.dir")));
        return "index";
    }
}
