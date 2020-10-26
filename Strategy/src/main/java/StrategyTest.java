import javax.sound.midi.Soundbank;

public class StrategyTest {
    public static void main(String[] args) {
        Strategy addStrategy = new AddStrategy();
        CalculateContext context = new CalculateContext(addStrategy);
        int i = context.doCalculate(3, 4);
        System.out.println("-------->" + i);
    }
}
