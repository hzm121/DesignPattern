/**
 * @author hzm
 */
public class DecoratePrintTimeAfterTask extends Decorate {
    public DecoratePrintTimeAfterTask(Component component) {
        super(component);
    }

    @Override
    public void doTask() {
        System.out.println(System.currentTimeMillis());
        super.doTask();
    }
}
