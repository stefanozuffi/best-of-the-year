package org.lessons.java.ex.best_of_the_year.classes;

public class Song {
    private int id;
    private String title;

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Song(String title) {
        this.id = (int) (Math.random() * 1000);
        this.title = title;
    }
    public Song(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
