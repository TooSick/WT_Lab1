package com.lizaveta16.task12;

import com.lizaveta16.task12.books.Book;
import com.lizaveta16.task12.books.ProgrammerBook;
import com.lizaveta16.task12.comparators.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("Eugene onegin", "Pushkin", 4, "9992161100");
        Book book2 = new Book("The captain's daughter", "Pushkin", 4, "9992161101");
        Book book3 = new Book("Eugene onegin", "Author", 4, "9992161102");
        Book book4 = new Book("Crime and punishment", "Dostoevsky", 2, "9992161100");
        System.out.println(book.equals(book));
        System.out.println(book.equals(book2));
        System.out.println(book.equals(book3));
        System.out.println(book.equals(1));
        System.out.println(book.toString());
        System.out.println(book.hashCode());

        Book bookClone = book.clone();
        System.out.println(bookClone.toString());

        testingProgrammerBook();

        List<Book> books = Arrays.asList(book, book2, book3, book4);
        testingDefaultSort(books);
        testingComparators(books);
    }

    private static void testingProgrammerBook() {
        ProgrammerBook pb = new ProgrammerBook("Crime and punishment",
                "Dostoevsky", 3, "9992161100", "English", 5);
        ProgrammerBook pb2 = new ProgrammerBook("Crime and punishment",
                "Dostoevsky", 3, "9992161100", "Russian", 5);
        ProgrammerBook pb3 = new ProgrammerBook("Eugene onegin",
                "Pushkin", 4, "9992161102", "Spanish", 4);
        System.out.println(pb.equals(pb));
        System.out.println(pb.equals(pb2));
        System.out.println(pb.equals(pb3));
        System.out.println(pb.equals(1));
        System.out.println(pb.toString());
        System.out.println(pb.hashCode());
    }

    private static void testingDefaultSort(List<Book> books) {
        Collections.sort(books);
        System.out.println("Default sort:");
        for (Book element : books) {
            System.out.println(element.toString());
        }
    }

    private static void testingComparators(List<Book> books) {
        Comparator<Book> comparator1 = new TitleComparator();
        testingSortWithComparator(comparator1, books);

        Comparator<Book> comparator2 = new TitleComparator()
                .thenComparing(new AuthorComparator());
        testingSortWithComparator(comparator2, books);

        Comparator<Book> comparator3 = new AuthorComparator()
                .thenComparing(new TitleComparator());
        testingSortWithComparator(comparator3, books);

        Comparator<Book> comparator4 = new AuthorComparator()
                .thenComparing(new TitleComparator())
                .thenComparing(new PriceComparator());
        testingSortWithComparator(comparator4, books);
    }

    private static void testingSortWithComparator(Comparator<Book> comparator, List<Book> list) {
        list.sort(comparator);
        System.out.println("Sort with comparator:");
        for (Book el : list) {
            System.out.println(el.toString());
        }
    }
}
