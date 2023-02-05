package com.spring.expensetracker.controllers;

import com.spring.expensetracker.entities.Expense;
import com.spring.expensetracker.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/expenses/{id}")
    public Expense getExpense(@PathVariable Long id){
        return expenseService.getExpenseById(id);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping("/expenses")
    public void deleteExpense(@RequestParam("id") Long id){
        expenseService.deleteExpenseById(id);
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("/expenses")
    public Expense saveExpense(@RequestBody Expense expense){
        return expenseService.saveExpense(expense);
    }

}


