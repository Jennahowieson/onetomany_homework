package com.codeclan.FileFolderHomework.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="folders")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="title")
    private String title;

    @JsonIgnoreProperties({"folders"})
    @ManyToOne
    @JoinColumn(name="person_id", nullable=true)
    private Person person;

    public Folder() {
    }

    public Folder(String title, Person person) {
        this.title = title;
        this.person = person;
    }


}
