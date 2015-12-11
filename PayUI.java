package MockCommand;

/**
 * Created by Marshall on 12/10/2015.
 */
public class PayUI implements AppInterface {
    @Override
    public void initUI() {
        System.out.println("initializing Payment UI...");
    }

    @Override
    public void loadUI() {
        System.out.println("Loading Payment UI...");
    }
}
