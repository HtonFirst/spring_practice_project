package al.kozlov.manager.repository;

import al.kozlov.manager.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryProductRepository implements ProductRepository{

    private final List<Product> productList = Collections.synchronizedList(new LinkedList<>());

    public InMemoryProductRepository() {
        IntStream.range(1, 4).forEach(i -> this.productList.add(new Product(i, "Product N%d".formatted(i),
                                                                               "Product description №%d".formatted(i))));
        System.out.println(productList);
    }

    @Override
    public List<Product> findAll() {
        return Collections.unmodifiableList(this.productList);
    }
}
