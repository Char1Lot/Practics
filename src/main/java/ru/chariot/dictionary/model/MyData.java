package ru.chariot.dictionary.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@lombok.Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MyData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long dictionary_id;
    private String code;
    private String value;
}
