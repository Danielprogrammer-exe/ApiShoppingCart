package pe.cibertec.ecommerce.ApiShoppingCart.service;

import pe.cibertec.ecommerce.ApiShoppingCart.dto.Purchase;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseResponse;


public interface ShoppingCartService {
    public PurchaseResponse placeOrder(Purchase purchase);
}
