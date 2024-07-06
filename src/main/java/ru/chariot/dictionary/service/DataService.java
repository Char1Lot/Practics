package ru.chariot.dictionary.service;

import ru.chariot.dictionary.model.Data;
import java.util.Map;

public interface DataService {

    Long saveData(Data data);
    Data findDataById(Long id);
    Map<String, String> updateData(Long id);

}
