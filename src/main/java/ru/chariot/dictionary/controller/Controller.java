package ru.chariot.dictionary.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.chariot.dictionary.model.Dictionary;
import ru.chariot.dictionary.model.Data;
import ru.chariot.dictionary.service.DataService;
import ru.chariot.dictionary.service.DictionaryService;

@AllArgsConstructor
@RestController
public class Controller {

    DictionaryService dictionaryService;
    DataService dataService;

    @RequestMapping("/dictionaries")
    @GetMapping
    public Dictionary getDictionary(){
        return new Dictionary(1L, "aaa", "bbb");
    }

    @RequestMapping("/dictionaries/records")
    @GetMapping
    public Data getDictRec(){
        return new Data(1L, 1L, "aaa", "bbb");
    }

    @PostMapping("/dictionaries")
    public long addDictionary(@RequestBody Dictionary dictionary){

        return dictionaryService.saveDictionary(dictionary);

    }

    @PostMapping("/dictionaries/records")
    public long addDictionary(@RequestBody Data data){

        return dataService.saveData(data);

    }

}
