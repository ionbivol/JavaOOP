package collection.list.product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Product1", 100 , "Description1"));
        productList.add(new Product("Product2", 50, "Description2"));

        Collections.sort(productList);

        for(Product p : productList){
            System.out.println(p.getProductName());
        }
        

    }
}
