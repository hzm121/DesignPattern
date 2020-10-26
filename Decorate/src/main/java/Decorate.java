/**
 * @author hzm
 */
public class Decorate implements Component {
    private Component component;

    public Decorate(Component component) {
        this.component = component;

    }

    @Override
    public void doTask() {
        component.doTask();
    }
}
