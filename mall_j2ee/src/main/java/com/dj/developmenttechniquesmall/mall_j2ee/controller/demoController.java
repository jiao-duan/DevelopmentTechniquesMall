package com.dj.developmenttechniquesmall.mall_j2ee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class demoController {

    @RequestMapping("indexPage")
    public String indexPage() {
        return "indexPage";
    }
}
