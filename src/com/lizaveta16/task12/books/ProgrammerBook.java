package com.lizaveta16.task12.books;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        var programmerBook = (ProgrammerBook) obj;
        return super.equals(obj)
                && language.equals(programmerBook.language)
                && (programmerBook.level == level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.language, this.level);
    }

    @Override
    public String toString() {
        return super.toString() + "; language: " + language + "; level: " + level;
    }
}