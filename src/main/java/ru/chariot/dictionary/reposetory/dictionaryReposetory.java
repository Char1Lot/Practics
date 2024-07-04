package ru.chariot.dictionary.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chariot.dictionary.model.Dictionary;

@Repository
public interface dictionaryReposetory extends JpaRepository<Dictionary, Long> {
}
