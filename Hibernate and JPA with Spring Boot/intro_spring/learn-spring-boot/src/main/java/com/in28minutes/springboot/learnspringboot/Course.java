package com.in28minutes.springboot.learnspringboot;

public class Course {

    private long id;
    private String name;
    private String author;

    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
