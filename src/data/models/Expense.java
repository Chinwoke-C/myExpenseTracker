package data.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Expense {
@Id
    private String id;
@Field("name")
@Indexed(unique = true)
    private String expenseName;
@Field("category")
    private Category category;
    private List<Transaction> transactions = new ArrayList<>();
    @Field("amount")
    private double amount;
    private LocalDateTime creationTime = LocalDateTime.now();
}
//    public double getAmount() {
//        return amount;
//    }
//
//    public void setAmount(double amount) {
//        this.amount = amount;
//    }
//
//    public LocalDateTime getCreationTime() {
//        return creationTime;
//    }
//
//    public void setCreationTime(LocalDateTime creationTime) {
//        this.creationTime = creationTime;
//    }
//
//
//
//    public String getItem() {
//        return item;
//    }
//
//    public void setItem(String item) {
//        this.item = item;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public List<Transaction> getTransactions() {
//        return transactions;
//    }
//
//    public void setTransactions(List<Transaction> transactions) {
//        this.transactions = transactions;
//    }
//}
