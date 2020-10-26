/**
 * @author hzm
 */
public class ReduceStrategy implements Strategy {

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
