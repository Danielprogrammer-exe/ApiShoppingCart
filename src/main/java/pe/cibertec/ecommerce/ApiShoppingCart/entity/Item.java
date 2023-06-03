package pe.cibertec.ecommerce.ApiShoppingCart.entity;

import jakarta.persistence.Embeddable;
import java.math.BigDecimal;
import lombok.Data;
@Data
@Embeddable
public class Item {
    private Long productId;
    private String productName;
    private BigDecimal unitPrice;
}