package services;

import data.models.Expense;
import data.repositories.ExpenseRepository;
import dtos.Request.CreateExpenseRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class ExpenseServiceImpl implements ExpenseService{
    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public String addExpense(CreateExpenseRequest createExpenseRequest) {
        Expense expense = mapFromDto(createExpenseRequest);
        return expenseRepository.insert(expense).getId();
    }

    private Expense mapFromDto(CreateExpenseRequest expenseRequest) {
        return Expense.builder()
                .expenseName(expenseRequest.getExpenseName())
                .category(expenseRequest.getCategory())
                .amount(expenseRequest.getAmount())
                .build();
    }
    public CreateExpenseRequest getExpense(String name){
        Expense expense = expenseRepository.findByName(name).orElseThrow(
                () -> new ExpenseNotFoundException(String.format("Cannot find Expense by name - %s", name)));
        return mapToDto(expense);
    }

    private CreateExpenseRequest mapToDto(Expense expense) {
        return CreateExpenseRequest.builder()
                .id(expense.getId())
                .expenseName(expense.getExpenseName())
                .category(expense.getCategory())
                .amount(expense.getAmount())
                .build();
    }

    @Override
    public void updateExpense(CreateExpenseRequest createExpenseRequest) {

    }

    @Override
    public void deleteExpense(String id) {

    }

    @Override
    public void viewExpense(String name) {

    }

    @Override
    public List<Expense> viewAll() {

        return expenseRepository.findAll();
    }
}
