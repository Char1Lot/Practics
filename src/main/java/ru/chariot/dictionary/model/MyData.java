package ru.chariot.dictionary.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "data")
public class MyData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "dictionary_id", nullable = false)
    private Long dictionary_id;
    @Column(name = "code")
    private String code;
    @Column(name = "value", nullable = false)
    private String value;
}
