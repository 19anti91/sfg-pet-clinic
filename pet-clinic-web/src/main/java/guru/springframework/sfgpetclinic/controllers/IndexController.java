package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anti1991 on 10/9/2018
 */

@Controller
public class IndexController {


    @RequestMapping({"", "/", "index.html", "index"})
    public String index() {
        return "index";
    }
}
