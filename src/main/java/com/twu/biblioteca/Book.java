package com.twu.biblioteca;

public class Book {

    private String name;
    private String author;
    private String yearPublished;
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }


    public String getName() {
        return name;
    }
    public String getAuthor() { return author; }
    public String getYearPublished() { return yearPublished; }

    public Book(String name, String author, String yearPublished, Boolean isChecked) {
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isChecked = isChecked;
    }

    @Override
    public String toString() {
        String availability = (isChecked) ? "Available" : "Unavailable";
        return "[" + availability + "] - " +  name + ", " + author + " - " + yearPublished + ";";
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof  Book) {
            Book otherBook = (Book) o;
            if (this.getName().equals(otherBook.getName()) &&
                    this.getAuthor().equals(otherBook.getAuthor()) &&
                    this.getYearPublished().equals(otherBook.getYearPublished())) {

                return true;
            }
        }
        return false;
    }
}
