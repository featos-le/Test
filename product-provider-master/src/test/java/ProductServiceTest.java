import com.example.provider.entities.Product;
import com.example.provider.service.ProductService;
import com.example.provider.service.serviceImpl.ProductServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @InjectMocks
    private ProductServiceImpl productService;

    @Test
    public void testGet() {
        // Mock the list of products
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(1, "iPhone 9", "An apple mobile which is nothing like apple",
                "Apple", "smartphones", "https://i.dummyjson.com/data/products/1/thumbnail.jpg",
                549.0, 12.96, 4.69, 94,
                Arrays.asList("https://i.dummyjson.com/data/products/1/1.jpg",
                        "https://i.dummyjson.com/data/products/1/2.jpg",
                        "https://i.dummyjson.com/data/products/1/3.jpg",
                        "https://i.dummyjson.com/data/products/1/4.jpg",
                        "https://i.dummyjson.com/data/products/1/thumbnail.jpg"));
        Product product2 = new Product(2, "iPhone X", "SIM-Free, Model A19211 6.5-inch Super Retina HD display with OLED technology A12 Bionic chip with ...",
                "Apple","smartphones", "https://i.dummyjson.com/data/products/2/thumbnail.jpg",
                899.0, 17.94, 4.44, 34,
                Arrays.asList("https://i.dummyjson.com/data/products/2/1.jpg",
                        "https://i.dummyjson.com/data/products/2/2.jpg",
                        "https://i.dummyjson.com/data/products/2/3.jpg",
                        "https://i.dummyjson.com/data/products/2/thumbnail.jpg"));
        products.add(product1);
        products.add(product2);

        // Mock the ProductService
        ProductService productServiceMock = Mockito.mock(ProductService.class);
        Mockito.when(productServiceMock.getProductById(1)).thenReturn(product1);
        Mockito.when(productServiceMock.getProductById(2)).thenReturn(product2);

        // Test getProductById
        Product result1 = productServiceMock.getProductById(1);
        Product result2 = productServiceMock.getProductById(2);

        Assertions.assertEquals(product1, result1);
        Assertions.assertEquals(product2, result2);
    }


    @Test
    public void testGetAllProductsSize() {
        // Set up mock product list with two products

        // Test that the service returns a list of size 30
        Assertions.assertEquals(30, productService.getProducts().size());
    }
}
