package ru.chariot.dictionary.model;


import jakarta.persistence.*;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dictionary")
public class Dictionary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false, unique = true)
    private Long id;
    @Column(name = "code", nullable = false)
    private String code;
    @Column(name = "description", nullable = true)
    private String description;
}
