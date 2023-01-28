package com.abdillah.domain;

public class Author {
    private Long id;

    private String name;

    private Long birthDate;

    public Author() {
    }

    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Author(Long id, Long birthDate, String name) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Author(Long id, String name, Long birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", name='" + getName() + "'" +
                ", birthDate='" + getBirthDate() + "'" +
                "}";
    }

}
