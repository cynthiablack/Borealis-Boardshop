package com.example.demo.controllers;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.Part;
import com.example.demo.service.InhousePartService;
import com.example.demo.service.InhousePartServiceImpl;
import com.example.demo.service.PartService;
import com.example.demo.service.PartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class AddInhousePartController{
    @Autowired
    private ApplicationContext context;

    @GetMapping("/showFormAddInPart")
    public String showFormAddInhousePart(Model theModel){
        InhousePart inhousepart=new InhousePart();
        theModel.addAttribute("inhousepart",inhousepart);
        return "InhousePartForm";
    }

    @PostMapping("/showFormAddInPart")
    public String submitForm(@Valid @ModelAttribute("inhousepart") InhousePart part, BindingResult theBindingResult, Model theModel){
        theModel.addAttribute("inhousepart",part);
        if(theBindingResult.hasErrors()){
            return "InhousePartForm";
        }
        boolean isValid = part.checkInv(part.getInv(), part.getMinInv(), part.getMaxInv());
        if(!isValid) {
            theBindingResult.rejectValue("inv", "error.inv", "Inventory must be between " + part.getMinInv() + " and " + part.getMaxInv());
            return "InhousePartForm";
        }
        boolean isAboveMin = part.checkInvAboveMin(part.getInv(), part.getMinInv());
        boolean isBelowMax = part.checkInvBelowMax(part.getInv(), part.getMaxInv());
        if(!isAboveMin) {
            theBindingResult.rejectValue("inv", "error.inv", "Inventory must be greater than or equal to " + part.getMinInv());
            return "InhousePartForm";
        }
        else if(!isBelowMax) {
            theBindingResult.rejectValue("inv", "error.inv", "Inventory must be less than or equal to " + part.getMaxInv());
            return "InhousePartForm";
        }
        else{
        InhousePartService repo=context.getBean(InhousePartServiceImpl.class);
        InhousePart ip=repo.findById((int)part.getId());
        if(ip!=null)part.setProducts(ip.getProducts());
            repo.save(part);

        return "confirmationaddpart";}
    }

}
