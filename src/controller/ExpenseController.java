package controller;

import data.models.Expense;
import dtos.Request.CreateExpenseRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import services.ExpenseService;

import java.net.URI;
//@RequestMapping("/api/expense")
@RequiredArgsConstructor
@RestController
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;
    @PostMapping("/expense")
    public ResponseEntity <Void> addExpense(@RequestBody CreateExpenseRequest createExpenseRequest){
        String expenseId = expenseService.addExpense(createExpenseRequest);
            URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(expenseId)
                    .toUri();
        return ResponseEntity.created(location).build();
    }
    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public CreateExpenseRequest getExpenseByName(@PathVariable String name){
        return expenseService.getExpense(name);
    }
}
