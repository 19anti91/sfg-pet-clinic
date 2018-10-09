package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Anti1991 on 10/9/2018
 */
@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/onwers/index", "/owners/index.html"})
    public String listVets() {

        return "owners/index";
    }
}
