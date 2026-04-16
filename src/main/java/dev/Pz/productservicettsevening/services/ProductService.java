package dev.Pz.productservicettsevening.services;

import dev.Pz.productservicettsevening.dtos.ProductDto;
import dev.Pz.productservicettsevening.exceptions.NotFoundException;
import dev.Pz.productservicettsevening.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAllProducts();

    Optional<Product> getSingleProduct(Long productId) throws NotFoundException;

    Product addNewProduct(ProductDto product);

    /*
    Product object has only those fields filled which need to be updated.
    Everything else is null
     */
    Product updateProduct(Long productId, Product product);
    // if (product.getImageUrl() != null) {
    //
    // }
    Product replaceProduct(Long productId, Product product);

    boolean deleteProduct(Long productId);
}

// update product with id 123
// {
//   name: iPhone 15
// }
