package com.ars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ars.model.Drink;
import com.ars.Service.DrinkService;

//http://localhost:8080/drink/
@Controller
@RequestMapping("/drink")
public class DrinkController {

    @Autowired
    private DrinkService service;

    @RequestMapping("/display")
    public ModelAndView displayDrinkInfo() {

        ModelAndView mv = new ModelAndView("displayDrink");

        List<Drink> drinks = service.displayDrink();

        mv.addObject("drinks", drinks);

        return mv;
    }

    @RequestMapping("/addDrink")
    public ModelAndView addDrink() {

        ModelAndView mv = new ModelAndView("addDrink");
        Drink drink = new Drink();

        mv.addObject("command", drink);

        return mv;
    }

    @RequestMapping(value = "/saveDrink", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("drink") Drink drink) {

        ModelAndView mv = new ModelAndView("displayDrink");
        service.addDrink(drink);
        List<Drink> drinks = service.displayDrink();
        mv.addObject("drinks", drinks);
        mv.addObject("msg", drink.getName() + " added successfully");
        return mv;
    }
}