import java.time.LocalDate;


public class PrintYearCalculateContext extends AbstractCalculateContext {

    public PrintYearCalculateContext(Strategy strategy) {
        super(strategy);
    }

    private void printYear() {
        System.out.println("--------->" + LocalDate.now().getYear());
    }

    @Override
    public int doCalculate(int a, int b) {
        printYear();
        return strategy.calculate(a, b);
    }
}
