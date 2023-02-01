package TP3.VAILLANT.Controller;

import TP3.VAILLANT.model.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AddresseController {

    @Autowired
    AddressRepository addressRepository;
    @GetMapping("/addresse")
    public String showAddresses(Model model) {
        model.addAttribute("allAddresses", addressRepository.findAll());
        return "addresse";
    }
}

