//package data.repositories;
//
//import data.models.Category;
//import data.models.Expense;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class ExpenseRepositoryImplTest {
//ExpenseRepository expenseRepository;
//Expense expense;
//    @BeforeEach
//    void setUp() {
//        expenseRepository = new ExpenseRepositoryImpl();
//        expense = new Expense();
//
//    }
//    @Test
//    public void addedExpenseReturnsOneTest(){
//        Expense expense = new Expense();
//        expense.setItem("veggies");
//        expense.setAmount(230.00);
//        expense.setCategory(Category.FOOD);
//        expenseRepository.addExpense(expense);
//        assertEquals(1,expenseRepository.count());
//    }
//    @Test
//    public void addedExpenseFindByIdReturnsSavedExpense(){
//        Expense expense = new Expense();
//        expense.setItem("veggies");
//        expense.setAmount(230.00);
//        expense.setCategory(Category.FOOD);
//        expenseRepository.addExpense(expense);
//        assertEquals(1,expenseRepository.count());
//        Expense savedExpense = expenseRepository.findById(1);
//        assertEquals(expense, savedExpense);
//    }
//    @Test
//    public void updateExpenseTest(){
//        Expense expense = new Expense();
//        expense.setItem("veggies");
//        expense.setAmount(230.00);
//        expense.setCategory(Category.FOOD);
//        expenseRepository.addExpense(expense);
//        assertEquals(1,expenseRepository.count());
//        Expense updatedExpense = new Expense();
//        updatedExpense.setId(1);
//        updatedExpense.setItem("Tomato");
//        updatedExpense.setAmount(200.00);
//        expenseRepository.addExpense(updatedExpense);
//        assertEquals(1,expenseRepository.count());
//        assertEquals("Tomato", updatedExpense.getItem());
//        assertEquals(200.00, updatedExpense.getAmount());
//    }
//    @Test
//    public void addedExpenseCanBeDeleted(){
//        Expense expense = new Expense();
//        expense.setItem("veggies");
//        expense.setAmount(230.00);
//        expense.setCategory(Category.FOOD);
//        expenseRepository.addExpense(expense);
//        assertEquals(1,expenseRepository.count());
//         expenseRepository.deleteById(1);
//         assertEquals(0, expenseRepository.count());
//    }
//    @Test
//    public void findAllExpenseTest() {
//        Expense expense = new Expense();
//        expense.setItem("veggies");
//        expense.setAmount(230.00);
//        expense.setCategory(Category.FOOD);
//        expenseRepository.addExpense(expense);
//        Expense expense2 = new Expense();
//        expenseRepository.addExpense(expense2);
//        Expense expense3 = new Expense();
//        expenseRepository.addExpense(expense3);
//        Expense expense4 = new Expense();
//        expenseRepository.addExpense(expense4);
//        assertEquals(4, expenseRepository.count());
//        expenseRepository.findAllExpense();
//        assertEquals("veggies", expense.getItem());
//    }
//    @Test
//    public void deleteAllExpenseTest(){
//        Expense expense = new Expense();
//        expense.setItem("veggies");
//        expense.setAmount(230.00);
//        expense.setCategory(Category.FOOD);
//        expenseRepository.addExpense(expense);
//        Expense expense2 = new Expense();
//        expenseRepository.addExpense(expense2);
//        Expense expense3 = new Expense();
//        expenseRepository.addExpense(expense3);
//        Expense expense4 = new Expense();
//        expenseRepository.addExpense(expense4);
//        assertEquals(4, expenseRepository.count());
//        expenseRepository.deleteAll(new Expense());
//        assertEquals(0, expenseRepository.count());
//    }
//}
