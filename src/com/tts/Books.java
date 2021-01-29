package com.tts;

//New class called Books
public class Books {
//    private fields (instance variables
    private String title;
    private String author;
    private String genre;
    private boolean isFiction;

// constructor using 2 of the 3 instance variables
    public Books(String title, String author) {
        this.title = title;
        this.author = author;
    }

// constructor that uses all 3 instance variable

    public Books(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }


// get methods for all 3

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }


// set methods for at  3

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


// a method that returns a boolean
    public boolean isFiction() {
        return isFiction;
    }

// a method that returns a string
    public void getBook(String title, String author, String genre) {
        System.out.println("Your book's title is: " + title + "\n It's written by: " + author + "\n And it's from this genre: " + genre);
    }


}
