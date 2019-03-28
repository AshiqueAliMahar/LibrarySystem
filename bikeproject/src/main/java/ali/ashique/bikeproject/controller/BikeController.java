package ali.ashique.bikeproject.controller;

import ali.ashique.bikeproject.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BikeController {
    @Autowired
    private BikeRepository bikeRepository;
    @RequestMapping(value = {"/",""},method = RequestMethod.GET)
    public String getBikes(Model model){
        model.addAttribute("bikes",bikeRepository.findAll());
        return "index.html";
    }
}
