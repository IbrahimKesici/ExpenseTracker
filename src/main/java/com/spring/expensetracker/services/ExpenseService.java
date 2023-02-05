package com.spring.expensetracker.services;

import com.spring.expensetracker.entities.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> getAllExpenses();
}
