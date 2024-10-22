package ie.atu.wk6;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @NotNull(message = "Id cannot be Null")
    private int id;
    @NotBlank(message = "Name cannot be Blank")
    private String name;
    @NotNull(message = "price cannot be Null")
    private int price;

}
