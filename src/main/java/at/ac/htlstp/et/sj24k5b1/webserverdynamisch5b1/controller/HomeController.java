package at.ac.htlstp.et.sj24k5b1.webserverdynamisch5b1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index.html")
    public String index(Model model) {
        return home(model);
    }

    @GetMapping("/")
    public String root(Model model) {
        return home(model);
    }

    @GetMapping("/abc")
    public String home(Model model) {
        model.addAttribute("msg", "Hallo Welt!");
        return "index";
    }


}
