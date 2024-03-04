package al.kozlov.manager.services;

import al.kozlov.manager.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();
}
