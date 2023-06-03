package pe.cibertec.ecommerce.ApiShoppingCart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiShoppingCart.entity.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
