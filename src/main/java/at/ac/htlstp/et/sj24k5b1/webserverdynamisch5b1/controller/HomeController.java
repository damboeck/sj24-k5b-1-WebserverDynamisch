package at.ac.htlstp.et.sj24k5b1.webserverdynamisch5b1.controller;

import at.ac.htlstp.et.sj24k5b1.webserverdynamisch5b1.model.IndexFormDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
        model.addAttribute("data", new IndexFormDto("xx"));
        return "index";
    }

    @PostMapping("/res")
    public String formAnswer(Model model, @ModelAttribute IndexFormDto data) {
        String feld = data.getFeld();
        System.out.println(feld);
        model.addAttribute("msg", "Antwort auf die Frage!");
        model.addAttribute("data", data);
        return "index";
    }



}
