package i.am.learning.spring.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class ownerController {

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwner(){
        return "owners/index";
    }
}
