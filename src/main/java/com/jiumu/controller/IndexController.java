package com.jiumu.controller;

import com.jiumu.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/indexController")
public class IndexController {
    @Autowired
    private IndexService indexService;

    public String index() {
        return "";
    }
}
