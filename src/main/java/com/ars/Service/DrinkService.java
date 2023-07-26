package com.ars.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ars.model.Drink;

@Service
public class DrinkService {


    private static List<Drink> drinks = new ArrayList<Drink>();

    static {
        Drink d1 = new Drink(1, "Virgin Pina Colada", "Cold Beverage");
        Drink d2 = new Drink(2, "Cappi Nirvana", "Cold Beverage");
        Drink d3 = new Drink(3, "Ginger Tea", "Hot Beverage");
        Drink d4 = new Drink(4, "Cafe Latte", "Hot Beverage");
        drinks.add(d1);
        drinks.add(d2);
        drinks.add(d3);
        drinks.add(d4);
    }


    public List<Drink> displayDrink(){
        return drinks;
    }


    public List<Drink> addDrink(Drink drink){
        drinks.add(drink);
        return drinks;
    }
}