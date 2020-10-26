import java.time.LocalDate;

public class PrintDayCalculateContext extends AbstractCalculateContext{
    public PrintDayCalculateContext(Strategy strategy) {
        super(strategy);
    }

    private void printDay(){
        System.out.println("--------->"+ LocalDate.now().getDayOfYear());
    }
    @Override
    public int doCalculate(int a, int b) {
        printDay();
        return strategy.calculate(a,b);
    }
}
