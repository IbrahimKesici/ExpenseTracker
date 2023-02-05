package com.spring.expensetracker.services;

import com.spring.expensetracker.entities.Expense;
import com.spring.expensetracker.exceptions.ResourceNotFoundException;
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
        throw new ResourceNotFoundException("Expense with id " + id + " is not found!");
    }

    public void deleteExpenseById(Long id){
        expenseRepository.deleteById(id);
    }

    public Expense saveExpense(Expense expense){
        return expenseRepository.save(expense);
    }

}

