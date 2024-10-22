package ie.atu.wk6;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();

    @GetMapping
    public List<Product> getProducts(){
        return myList;
    }

    @PostMapping
    public List<Product> addProduct(Product product)
    {
        //Do business stuff like retrieving details from db, or generating files pdfs
        myList.add(product);
        return myList;
    }

    @PutMapping
    public List<Product> updateProduct(Product product)
    {
        for(Product p : myList){
            if(p.getId().equals(id)){
                myList.remove(p);
            }
            myList.add(product);
            return myList;
        }
    }

}
