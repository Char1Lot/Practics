package ru.chariot.dictionary.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "dictionary_id", nullable = false)
    private Long dictionary_id;
    @Column(name = "code")
    private String code;
    @Column(name = "value", nullable = false)
    private String value;
}
