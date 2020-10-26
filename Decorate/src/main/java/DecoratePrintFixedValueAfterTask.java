/**
 * @author hzm
 */
public class DecoratePrintFixedValueAfterTask extends Decorate {
    private String fixedValue;

    public DecoratePrintFixedValueAfterTask(Component component, String fixedValue) {
        super(component);
        this.fixedValue = fixedValue;
    }

    @Override
    public void doTask() {
        System.out.println(fixedValue);
        super.doTask();
    }
}
