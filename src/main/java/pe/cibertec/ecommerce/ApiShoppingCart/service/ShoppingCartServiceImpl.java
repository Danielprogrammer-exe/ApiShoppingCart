
package pe.cibertec.ecommerce.ApiShoppingCart.service;

import jakarta.transaction.Transactional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiShoppingCart.dao.OrderRepository;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.Purchase;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiShoppingCart.entity.Order;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    
    @Autowired
    private OrderRepository orderRepository;

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        Order order = purchase.getOrder();
        order.setTrackingNumber(getTrackingNumer());
        purchase.getOrderItems().forEach(i->{
            order.addOrderItem(i);
        });
        orderRepository.save(order);
        return new PurchaseResponse(order.getTrackingNumber());
    }
    
    private String getTrackingNumer(){
        return UUID.randomUUID().toString();
    }
    
}
