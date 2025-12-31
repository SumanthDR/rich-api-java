package com.rich.rich_api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rich.rich_api.dto.PaginationViewRequestDto;
import com.rich.rich_api.dto.SaveExpenseRequestDto;
import com.rich.rich_api.dto.ViewExpenseListResponseDto;
import com.rich.rich_api.model.Expense;
import com.rich.rich_api.repository.IExpenseRepository;


@Service
public class ExpenseServices
{
    @Autowired
    private IExpenseRepository expenseRepository;

    public Expense saveExpense(SaveExpenseRequestDto expenseDto)
    {
        Expense expense = null;
        try
        {
            expense.setCategory(expenseDto.getCategory());
            expense.setDescription(expenseDto.getDescription());
            expense.setAmount(expenseDto.getAmount());
            expense.setLocalCreatedDate(expenseDto.getLocalCreatedDate());

            expenseRepository.save(expense);
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }

        return expense;
    }

    public List<ViewExpenseListResponseDto> getAllExpenses(PaginationViewRequestDto paginationViewRequestDto)
    {
        int offset = paginationViewRequestDto.getPageNumber() * paginationViewRequestDto.getPageSize();
        
        List<ViewExpenseListResponseDto> expenseList = null;
        try
        {
                List<Object[]> expenseData = expenseRepository.findExpensesWithPagination(
                paginationViewRequestDto.getStartDate(),
                paginationViewRequestDto.getEndDate(),
                paginationViewRequestDto.getPageSize(),
                offset  
            );

            expenseList = expenseData.stream().map(row -> 
                {
                    ViewExpenseListResponseDto expenseRow = new ViewExpenseListResponseDto();
                    expenseRow.setId(((Number)row[0]).intValue());
                    expenseRow.setCategory((String)row[1]);
                    expenseRow.setDescription((String)row[2]);
                    expenseRow.setAmount(((Double)row[3]));
                    expenseRow.setLocalCreatedDate(row[4].toString());
                    expenseRow.setTotalRecords(((Number)row[5]).intValue());
                    return expenseRow;
                }
            ).toList();
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }

        return expenseList;
    }
}