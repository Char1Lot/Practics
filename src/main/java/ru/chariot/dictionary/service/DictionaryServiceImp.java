package ru.chariot.dictionary.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chariot.dictionary.model.Dictionary;
import ru.chariot.dictionary.reposetory.DictionaryReposetory;


import java.util.Map;

@Service
@AllArgsConstructor
public class DictionaryServiceImp implements DictionaryService{

    DictionaryReposetory dictionaryReposetory;

    @Override
    public Long saveDictionary(Dictionary dictionary) {
        return dictionaryReposetory.save(dictionary).getId();
    }

    @Override
    public Dictionary findDictionaryById(Long id) {
        return null;
    }

    @Override
    public Map<String, String> updateDictionary(Long id) {
        return Map.of();
    }

}
