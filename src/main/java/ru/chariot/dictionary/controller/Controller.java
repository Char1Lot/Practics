package ru.chariot.dictionary.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.chariot.dictionary.model.Dictionary;
import ru.chariot.dictionary.model.MyData;
import ru.chariot.dictionary.service.DictionaryService;

@AllArgsConstructor
@RestController
public class Controller {

    DictionaryService dictionaryServise;

    @RequestMapping("/dictionaries")
    @GetMapping
    public Dictionary getDictionary(){
        return new Dictionary(1L, "aaa", "bbb");
    }

    @RequestMapping("/dictionaries/records")
    @GetMapping
    public MyData getDictRec(){
        return new MyData(1L, 1L, "aaa", "bbb");
    }

    @PostMapping("/dictionaries")
    public long addDictionary(@RequestBody Dictionary dictionary){

        return dictionaryServise.saveDictionary(dictionary);

    }

    @PostMapping("/dictionaries/records")
    public long addDictionary(@RequestBody MyData data){

        return 1L;

    }



}
