package ru.chariot.dictionary.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.chariot.dictionary.model.Dictionary;

@AllArgsConstructor
@RestController
@RequestMapping("/dictionaries")
public class Controller {


    @GetMapping
    public Dictionary getDict(){
        return new Dictionary(1L, "aaa", "bbb");
    }

}
