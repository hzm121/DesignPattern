public class TestDecorate {
    public static void main(String[] args) {
        Component c1 = new ConcreteComponent();
        Component c2 = new ConcreteComponent();
        Decorate d1 =  new DecoratePrintFixedValueAfterTask(c1,"Hello---->");
        Decorate d2 =  new DecoratePrintTimeAfterTask(c2);
        d1.doTask();
        d2.doTask();
    }
}
