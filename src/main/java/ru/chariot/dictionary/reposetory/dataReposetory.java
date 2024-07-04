package ru.chariot.dictionary.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chariot.dictionary.model.MyData;

@Repository
public interface dataReposetory extends JpaRepository<MyData, Long> {
}
