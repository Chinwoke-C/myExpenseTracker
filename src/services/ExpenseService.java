package services;

import data.models.Category;
import data.models.Expense;
import dtos.Request.CreateExpenseRequest;

import java.util.List;


public interface ExpenseService{
    String addExpense(CreateExpenseRequest createExpenseRequest);
    CreateExpenseRequest getExpense(String name);
    void updateExpense(CreateExpenseRequest createExpenseRequest);
    void deleteExpense(String id);
    void viewExpense(String name);
    List<Expense>viewAll();


}
