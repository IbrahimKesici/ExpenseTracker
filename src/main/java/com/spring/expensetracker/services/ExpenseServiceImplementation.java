package com.spring.expensetracker.services;

import com.spring.expensetracker.entities.Expense;
import com.spring.expensetracker.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseServiceImplementation implements ExpenseService{

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseServiceImplementation(ExpenseRepository expenseRepository){
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }

    public Expense getExpenseById(Long id){
        Optional<Expense> expense =  expenseRepository.findById(id);
        if (expense.isPresent()){
            return expense.get();
        }
        throw new RuntimeException("Expense not found!");

    }
}

