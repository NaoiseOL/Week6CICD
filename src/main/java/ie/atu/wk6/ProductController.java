package ie.atu.wk6;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService myService;

    public ProductController(ProductService myService) {
        this.myService = myService;
    }

    private List<Product> list = new ArrayList<>();
    //creating a class which is interested in requests and responses

    @PostMapping
    public List<Product> newProduct(@RequestBody Product product){

        //send it to do business logic
        ProductService myService = new ProductService();
        list = myService.addProduct(product);
        return list;
    }
}
