package collection.list.product;

public class Product implements Comparable<Product>{
    private String productName;
    private int productPrice;
    private String productDescription;


    public Product(String productName, int productPrice, String productDescription) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


    @Override
    public int compareTo(Product o) {
//
//        if(this.productPrice > o.productPrice){
//            return 1;
//
//        }else if(this.productPrice < o.productPrice){
//          return -1;
//         }else
//
//        return 0;
        return Integer.compare(getProductPrice(), o.getProductPrice());
    }
}
