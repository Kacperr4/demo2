package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/dupa")
public class DupaController {

    @GetMapping("/dudupa")
    private String showDupa(){
        return "<svg height=\"220\" width=\"500\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "  <polygon points=\"100,10 150,190 50,190\" style=\"fill:lime;stroke:purple;stroke-width:3\" />\n" +
                "</svg>";
    }
}
