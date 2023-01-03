package data.repositories;

import data.models.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface ExpenseRepository extends MongoRepository<Expense,String> {
    @Query("{'name': ?0}")
    Optional<Expense> findByName(String name);
//    Expense  addExpense(Expense expense);
//    Expense findById(int id);
//    void deleteAll(Expense expense);
//    void deleteById(int id);
//    void updateExpense(Expense expense);
//    List<Expense>findAllExpense();
//    long count();
}
