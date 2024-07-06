package ru.chariot.dictionary.service;

import ru.chariot.dictionary.model.Dictionary;
import java.util.Map;

public interface DictionaryService {

    Long saveDictionary(Dictionary dictionary);
    Dictionary findDictionaryById(Long id);
    Map<String, String> updateDictionary(Long id);

}
