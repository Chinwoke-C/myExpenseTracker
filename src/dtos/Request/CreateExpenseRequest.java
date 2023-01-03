package dtos.Request;

import data.models.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateExpenseRequest {
    private String id;
    private String expenseName;
    private double amount;
    private Category category;

}
