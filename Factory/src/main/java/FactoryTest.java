public class FactoryTest {
    public static void main(String[] args) {
        Product tv = ProductFactory.product("tv");
        tv.work();
    }
}
