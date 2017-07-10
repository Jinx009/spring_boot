package com.jinx.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by jinx on 7/10/17.
 */
@Entity
@Table(name = "TBL_USER")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String password;
}