package com.dandoesstufff.Todo.List.models;

import javax.persistence.*;

@Entity
@Table(name = "Tasks")
public class Task {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    @Column(name ="contents", nullable = false)
    private String contents;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
