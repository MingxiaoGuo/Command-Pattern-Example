package MockCommand;

/**
 * Created by Marshall on 12/10/2015.
 * Concrete Command
 */
public class ConfirmCommand implements Command {

    AppInterface nextUI;

    public ConfirmCommand(AppInterface newUI) {
        this.nextUI = newUI;
    }

    @Override
    public void execute() {
        nextUI.initUI();
        nextUI.loadUI();
    }

}
