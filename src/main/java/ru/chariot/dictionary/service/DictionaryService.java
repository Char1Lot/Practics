package ru.chariot.dictionary.service;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chariot.dictionary.dto.DictionaryDTO;
import ru.chariot.dictionary.model.Dictionary;
import ru.chariot.dictionary.reposetory.dictionaryReposetory;

@Service
@AllArgsConstructor
public class DictionaryService {

    private final dictionaryReposetory dictionaryReposetory;


}
