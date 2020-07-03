package com.aspectj;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class AccountTest {

    @Test
    void getBalance() {
        Account account = new Account();
        assertEquals(100, account.getBalance());
    }

    @Test
    void deposit() {
        Account account = new Account();
        account.deposit(100);
        assertEquals(200, account.getBalance());
    }

    @Test
    void withdraw() {
        Account account = new Account();
        account.withdraw(10);
        assertEquals(90, account.getBalance());
    }
}