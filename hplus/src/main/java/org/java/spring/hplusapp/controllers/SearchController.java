package org.java.spring.hplusapp.controllers;

import org.java.spring.hplusapp.beans.Product;
import org.java.spring.hplusapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/search")
    public String search(@RequestParam("search") String search, Model model){
        System.out.println("in search controller..!" + search);
        List<Product> products =  productRepository.searchByName(search);
        System.out.println("in search controller..!" + search);
        model.addAttribute("products", products);
        System.out.println("in search controller..!" + products.size());
        return "search";
    }

}
