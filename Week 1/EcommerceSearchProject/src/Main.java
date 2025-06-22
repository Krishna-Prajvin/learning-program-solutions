public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Phone", "Electronics")
        };

        System.out.println("Linear Search:");
        Product found1 = Search.linearSearch(products, "Watch");
        System.out.println(found1 != null ? found1 : "Product not found");

        System.out.println("\nBinary Search:");
        Product found2 = Search.binarySearch(products, "Watch");
        System.out.println(found2 != null ? found2 : "Product not found");
    }
}

