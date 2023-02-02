package com.example.myself.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "person")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Person {
    @GeneratedValue
    @Id
    private Integer id;

    private String name;

    private Integer age;

    private String identityCard;
}
