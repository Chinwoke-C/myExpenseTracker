package data.models;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Transaction {
private String TransactionId;
private Category category;
private int amount;
private LocalDateTime transactionTime = LocalDateTime.now();

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public LocalDateTime getTransactionTime() {
//        return transactionTime;
//    }
//
//    public void setTransactionTime(LocalDateTime transactionTime) {
//        this.transactionTime = transactionTime;
//    }
}
