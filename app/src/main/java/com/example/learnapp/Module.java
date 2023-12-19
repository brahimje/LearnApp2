package com.example.learnapp;

public class Module {
    private int id;
    private String acronym;
    private String name;
    private String description;
    private int credit;

    // Constructor
    public Module(int id, String acronym, String name, String description, int credit) {
        this.id = id;
        this.acronym = acronym;
        this.name = name;
        this.description = description;
        this.credit = credit;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getAcronym() {
        return acronym;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredit() {
        return credit;
    }
}

