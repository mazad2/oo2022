package com.example.webapp;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ListController {
    List<String> strings = new ArrayList<>(Arrays.asList(
            "Scooby Doo","Mickey Mouse", "Donald Duck" ));

    @GetMapping("strings")
    public List<String> getStrings(){
        return strings;
    }
    @GetMapping("strings/{index}")
    public String getStrings(@PathVariable int index){
        return strings.get(index);
    }
    @DeleteMapping("strings/{index}")
    public String deleteString(@PathVariable int index){
        return strings.remove(index);
    }
    @DeleteMapping("strings") //localhost:8080/strings/
    public String deleteAllString(){
        strings.clear();
        return "Kõik tooted on kustutatud";
    }
    @PostMapping("strings") //localhost:8080/strings POST
    public void addString(@RequestBody String string){
        strings.add(string);
    }

    @PutMapping("strings/{index}") //localhost:8080/strings/1 PUT
    public void editString(@PathVariable int index, @RequestBody String string){
        strings.set(index, string);
    }


}
