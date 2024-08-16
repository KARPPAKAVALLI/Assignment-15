package com.assignment15.library;

import com.assignment15.library.books.Book;
import com.assignment15.library.members.Member;
import com.assignment15.library.transactions.Transaction;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Percy Jackson", "Rick Riordan");

        Member member1 = new Member("Jake", "M001");

        String issueDate = "2024-08-15"; // YYYY-MM-DD format

        Transaction transaction1 = new Transaction(book1, member1, issueDate);
        book1.setAvailable(false); // Mark the book as borrowed

        System.out.println(transaction1);

        String returnDate = "2024-08-22"; // Simulating a return date 7 days later

        transaction1.returnBook(returnDate);

        System.out.println(transaction1);
    }
}
