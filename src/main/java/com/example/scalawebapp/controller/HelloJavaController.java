package com.example.scalawebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: HelloJavaController
 *
 * @author: weimengchao
 * @version: 1.0
 * Create: 2016/5/18
 * Copyright: Copyright (c)2016
 * Company: songxiaocai
 * -
 * Modification History:
 * Date              Author      Version     Description
 * —————————————————————————————————
 * 2016/5/18       weimengchao    1.0       1.0 Version
 */
@Controller
public class HelloJavaController {

    @RequestMapping("/hellojava.html")
    public String hello() {
        return "hellojava";
    }
}
    