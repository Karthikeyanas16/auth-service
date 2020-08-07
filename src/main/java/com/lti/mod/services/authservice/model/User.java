package com.lti.mod.services.authservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column(unique=true)
    private String email;

    @Column
    @JsonIgnore
    private String password;

    @Column
    private String role;

    @Column(name="technology_id")
    private String technology;

    @Column
    private String status;

    @Transient
    private String token;

}
