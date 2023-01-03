//package data.repositories;
//
//import data.models.Expense;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ExpenseRepositoryImpl implements ExpenseRepository{
//    List<Expense> expenseDB = new ArrayList<>();
//    private  int idCounter;
//
//    @Override
//    public Expense addExpense(Expense expense) {
//        if (expense.getId() != 0) updateExpense(expense);
//        else {
//        expenseDB.add(expense);
//            idCounter++;
//            expense.setId(idCounter);
//        }
//            return expense;
//    }
//    @Override
//    public void updateExpense(Expense expense) {
//        Expense expense1 = findById(expense.getId());
//        expense1.setItem(expense.getItem());
//        expense1.setAmount(expense.getAmount());
//        expense1.setCategory(expense.getCategory());
//
//    }
//    @Override
//    public Expense findById(int id) {
//        for (Expense expenses:expenseDB) {
//            if (expenses.getId() != 0){
//                return expenses;
//            }
//
//        }
//        return null;
//    }
//
//    @Override
//    public void deleteAll(Expense expense) {
//findAllExpense().removeAll(expenseDB);
//    }
//
//    @Override
//    public void deleteById(int id) {
//        expenseDB.removeIf(expense -> expense.getId() == id);
//
//    }
//
//
//
//    @Override
//    public List<Expense> findAllExpense() {
//        return expenseDB;
//    }
//
//    @Override
//    public long count() {
//        return expenseDB.size();
//    }
//}
