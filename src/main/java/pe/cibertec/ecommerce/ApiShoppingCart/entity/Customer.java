
package pe.cibertec.ecommerce.ApiShoppingCart.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Customer {
    private Long customerId;
    private String name;
    private String phone;
    private String email;
}
