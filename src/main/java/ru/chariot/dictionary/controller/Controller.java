package ru.chariot.dictionary.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.chariot.dictionary.model.Dictionary;
import ru.chariot.dictionary.model.Data;
import ru.chariot.dictionary.service.DataService;
import ru.chariot.dictionary.service.DictionaryService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/dictionaries")
public class Controller {

    DictionaryService dictionaryService;
    DataService dataService;

    @GetMapping("/{dictionaryId}")
    public Dictionary getDictionary(@PathVariable Long dictionaryId){

        return dictionaryService.findDictionaryById(dictionaryId);

    }

    @GetMapping
    public List<Dictionary> getAllDictionary(){

        return dictionaryService.findAllDictionary();

    }

    @PostMapping
    public Dictionary addRecord(@RequestBody Dictionary dictionary){

        return dictionaryService.saveDictionary(dictionary);

    }


    @PutMapping("/{dictionaryId}")
    public Dictionary putDictionary(@PathVariable Long dictionaryId, @RequestBody Dictionary dictionary){

        return dictionaryService.updateDictionary(dictionaryId, dictionary);

    }

    @DeleteMapping("/del/{dictionaryId}")
    public Dictionary delDictionary(@PathVariable Long dictionaryId){

        return dictionaryService.deleteDictionary(dictionaryId);

    }

    @GetMapping("/records/{recordId}")
    public Data getDictRec(@PathVariable Long recordId){
        return dataService.findDataById(recordId);
    }

    @GetMapping("/records")
    public List<Data> getAllDictRecords(){
        return dataService.findAllData();
    }

    @PostMapping("/records")
    public Data addRecord(@RequestBody Data data){

        return dataService.saveData(data);

    }

    @PutMapping("/records/{recordId}")
    public Data updateRecord(@PathVariable Long recordId, @RequestBody Data data){

        return dataService.updateData(recordId, data);

    }

    @DeleteMapping("/records/del/{recordId}")
    public Data delRecord(@PathVariable Long recordId){

        return dataService.deleteData(recordId);

    }

}
