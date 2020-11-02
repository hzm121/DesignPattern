public class Car implements Product{
    @Override
    public void work() {
        System.out.println(this.getClass().getSimpleName() + "work.....");
    }
}
