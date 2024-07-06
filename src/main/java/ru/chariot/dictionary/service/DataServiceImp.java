package ru.chariot.dictionary.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chariot.dictionary.model.Dictionary;
import ru.chariot.dictionary.model.Data;
import ru.chariot.dictionary.reposetory.DataReposetory;

import java.util.Map;

@Service
@AllArgsConstructor
public class DataServiceImp implements DataService {

    DataReposetory datareposetory;

    @Override
    public Long saveData(Data data) {
        return datareposetory.save(data).getId();
    }

    @Override
    public Data findDataById(Long id) {
        return null;
    }

    @Override
    public Map<String, String> updateData(Long id) {
        return Map.of();
    }
}
