public abstract class AbstractCalculateContext {
    protected Strategy strategy;

    public AbstractCalculateContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public abstract int doCalculate(int a, int b);
}
