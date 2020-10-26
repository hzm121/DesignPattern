/**
 * @author hzm
 */
public class CalculateContext {
    private Strategy strategy;

    public CalculateContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public int doCalculate(int a, int b) {
        return strategy.calculate(a, b);
    }

}
