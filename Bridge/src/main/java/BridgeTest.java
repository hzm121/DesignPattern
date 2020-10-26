public class BridgeTest {
    public static void main(String[] args) {
        Strategy add = new AddStrategy();
        Strategy reduce = new ReduceStrategy();
        Strategy multiply = new MultiplyStrategy();
        Strategy divided = new DividedStrategy();
        AbstractCalculateContext printYearAddCalculateContext = new PrintYearCalculateContext(add);
        AbstractCalculateContext printDayAddCalculateContext = new PrintDayCalculateContext(add);
        AbstractCalculateContext printYearReduceCalculateContext = new PrintYearCalculateContext(reduce);
        AbstractCalculateContext printDayReduceCalculateContext = new PrintDayCalculateContext(reduce);

        System.out.println(printYearAddCalculateContext.doCalculate(5, 4));
        System.out.println( printDayAddCalculateContext.doCalculate(3,4));

    }
}
