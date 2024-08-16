package com.assignment15.library.members;

public class Member {
    //1. Design a library management system using packages.
    // Create packages such as library.books , library.members , and library.transactions .
    // Implement classes within these packages to represent books, members, and transactions.
    // Demonstrate the usage of packages to organize the code logically.

    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return "Member [Name=" + name + ", Member ID=" + memberId + "]";
    }
}
