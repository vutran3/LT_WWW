package com.example.tranducvu.entities;

public class Student {
    private String id;
    private String name;
    private Class StudentClass;

    public Student() {}

    public Student(String id, String name, Class studentClass) {
        this.id = id;
        this.name = name;
        StudentClass = studentClass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(Class studentClass) {
        StudentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", StudentClass=" + StudentClass +
                '}';
    }
}
