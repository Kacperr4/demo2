package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController("/debile")
public class LicznikDebiliController {
    ArrayList<Idioci> idioci = new ArrayList<Idioci>();

    @GetMapping("/addBasicIdiota")
    public int dodajIdiote(){
        Idioci idiota = new Idioci(10, "Oskar");
        idioci.add(idiota);
        return idioci.size();
    }
    @GetMapping("/pokazIdiote/{index}")
    public String pokazIdiote(@PathVariable int index){
        return idioci.get(index).getImie();
    }
}
