package me.bumjin.demolearnspringboot.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class UserDomain {
    @GeneratedValue
    @Id
    Long id;

    String name;
}
