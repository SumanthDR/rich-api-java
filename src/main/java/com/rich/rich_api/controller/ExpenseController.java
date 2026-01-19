package com.rich.rich_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rich.rich_api.dto.PaginationViewRequestDto;
import com.rich.rich_api.dto.SaveExpenseRequestDto;
import com.rich.rich_api.dto.ViewExpenseListResponseDto;
import com.rich.rich_api.model.Expense;
import com.rich.rich_api.services.ExpenseServices;


@RestController
@RequestMapping("/api/expenses")
public class ExpenseController 
{

    @Autowired
    private ExpenseServices expenseServices;

    @PostMapping("/save")   
    public Expense savExpense(@RequestBody SaveExpenseRequestDto expenseDto)
    {
        Expense expense = expenseServices.saveExpense(expenseDto);
        return expense;
    }

    @PostMapping("/getAllExpenses")
    public List<ViewExpenseListResponseDto> getAllExpenses(@RequestBody PaginationViewRequestDto paginationViewRequestDto)
    {
        return expenseServices.getAllExpenses(paginationViewRequestDto);
    }
}