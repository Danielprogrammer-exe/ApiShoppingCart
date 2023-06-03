package pe.cibertec.ecommerce.ApiShoppingCart.dto;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import pe.cibertec.ecommerce.ApiShoppingCart.entity.Order;
import pe.cibertec.ecommerce.ApiShoppingCart.entity.OrderItem;

@Getter
@Setter
public class Purchase {
    Order order;
    Set<OrderItem> orderItems;
}
