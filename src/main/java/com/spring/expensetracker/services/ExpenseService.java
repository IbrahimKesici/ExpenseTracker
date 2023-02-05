package com.spring.expensetracker.services;

import com.spring.expensetracker.entities.Expense;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {
    List<Expense> getAllExpenses();
    Expense getExpenseById(Long id);
}
