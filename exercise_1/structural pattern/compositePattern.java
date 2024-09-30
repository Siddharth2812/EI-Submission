
import java.util.ArrayList;
import java.util.List;

interface Product {
    void showProductDetails();
}

class SingleProduct implements Product {
    private String productName;
    private double price;

    public SingleProduct(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public void showProductDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }
}

class ProductCategory implements Product {
    private String categoryName;
    private List<Product> products = new ArrayList<>();

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public void showProductDetails() {
        System.out.println("Category: " + categoryName);
        for (Product product : products) {
            product.showProductDetails();
        }
    }
}

public class compositePattern {
    public static void main(String[] args) {
        SingleProduct product1 = new SingleProduct("Laptop", 1200);
        SingleProduct product2 = new SingleProduct("Smartphone", 800);
        SingleProduct product3 = new SingleProduct("Tablet", 400);

        ProductCategory electronics = new ProductCategory("Electronics");
        electronics.addProduct(product1);
        electronics.addProduct(product2);

        ProductCategory gadgets = new ProductCategory("Gadgets");
        gadgets.addProduct(product3);

        ProductCategory mainCatalog = new ProductCategory("Main Catalog");
        mainCatalog.addProduct(electronics);
        mainCatalog.addProduct(gadgets);

        mainCatalog.showProductDetails();
    }
}
