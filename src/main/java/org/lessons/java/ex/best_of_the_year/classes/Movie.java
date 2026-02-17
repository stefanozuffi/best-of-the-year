package org.lessons.java.ex.best_of_the_year.classes;

public class Movie {
    private int id;
    private String title;

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Movie(String title) {
        this.id = (int) (Math.random() * 1000);
        this.title = title;
    }
    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
