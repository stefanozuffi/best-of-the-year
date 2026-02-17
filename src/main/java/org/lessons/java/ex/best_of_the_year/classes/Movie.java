package org.lessons.java.ex.best_of_the_year.classes;

public class Movie {
    private int id;
    private String title;

    protected int getID() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Movie(String title) {
        this.title = title;
    }
}
