package org.java.spring.hplusapp.controllers;

import org.java.spring.hplusapp.beans.Product;
import org.java.spring.hplusapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.Callable;

@Controller
public class SearchController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/search")
    public Callable<String> search(@RequestParam("search") String search, Model model, HttpServletRequest request){
        System.out.println("in search controller..!" + search);
        System.out.println("Is async supported : "+ request.isAsyncSupported());
        System.out.println("Async thread name"+Thread.currentThread().getName());

        return () -> {
            Thread.sleep(3000);
            List<Product> products =  productRepository.searchByName(search);
            System.out.println("in search controller..!" + search);
            model.addAttribute("products", products);
            System.out.println("in search controller..!" + products.size());
            return "search";
        };
    }

}
