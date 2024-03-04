package al.kozlov.manager.repository;

import al.kozlov.manager.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
