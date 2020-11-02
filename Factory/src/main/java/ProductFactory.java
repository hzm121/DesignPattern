public class ProductFactory {
    public static Product product(String productName) throws IllegalArgumentException{
        switch (productName){
            case "tv":
                return new TV();
            case "car":
                return new Car();
            default:
                throw new IllegalArgumentException("product not exist");
        }
    }
}
