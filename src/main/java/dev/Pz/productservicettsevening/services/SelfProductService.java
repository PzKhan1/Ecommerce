package dev.Pz.productservicettsevening.services;

import dev.Pz.productservicettsevening.dtos.ProductDto;
import dev.Pz.productservicettsevening.exceptions.NotFoundException;
import dev.Pz.productservicettsevening.models.Product;
import dev.Pz.productservicettsevening.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "selfProductService")
//@Primary
public class SelfProductService implements ProductService {
    private ProductRepository productRepository;

    public SelfProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getSingleProduct(Long productId) throws NotFoundException {
        Product product = productRepository.findProductById(productId);

        if (product == null) {
            throw new NotFoundException("Product Doesn't Exist");
        }

        return Optional.of(product);
    }

    @Override
    public Product addNewProduct(ProductDto product) {
        return null;
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long productId, Product product) {
        return null;
    }

    @Override
    public boolean deleteProduct(Long productId) {
        return false;
    }
}
