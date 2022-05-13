package com.example.webapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("tooted") //localhost.8080/tooted
    public String saaTooted(){
        return "Said tooted kätte";
    }

    @GetMapping("prindi-logidesse")
    public String prindiLogidesse(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Logi nr" + i);
        }
        return "Logidesse edukalt prinditatud";
    }
    @GetMapping("liida/{arv1}/{arv2}")
    public int liidaKokku(@PathVariable int arv1, @PathVariable int arv2) {
        return arv1 + arv2;
    }
    List<String> s6nad = new ArrayList<>();
    //String[] s6nad = {};
    @GetMapping("saa-sonad")
    public List<String> saaSonad() {
        return s6nad;
    }

    @GetMapping("lisa-sonad/{sona}") //localhost:8080/lisa-sona/
    public List<String> saaSonad(@PathVariable String sona){
        s6nad.add(sona);
        return s6nad; // []
    }

    @GetMapping("saa-yks-s6na/{index}") // locaalhost:8080/sa-yks-s6na/1
    public String saaYksSona(@PathVariable int index){
        return s6nad.get(index);
    }
    //404--sellit URL ei ole
    //400-muuutujat ei osatuvvad convertida Bad Request
    //403-forbidden
    //4001-need authentication, saaad ligi kui autendid

}
