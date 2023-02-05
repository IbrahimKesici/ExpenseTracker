package com.spring.expensetracker.controllers;

import com.spring.expensetracker.entities.Expense;
import com.spring.expensetracker.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {
    private final ExpenseService expenseService;
    @Autowired
    public ExpenseController(ExpenseService expenseService){
        this.expenseService = expenseService;
    }
    @GetMapping("/expenses")
    public List<Expense> getExpenses(){
        return expenseService.getAllExpenses();
    }
}

