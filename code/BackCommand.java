package MockCommand;

/**
 * Created by Marshall on 12/10/2015.
 */
public class BackCommand implements Command {

    AppInterface previousUI;

    public BackCommand(AppInterface newUI) {
        this.previousUI = newUI;
    }

    @Override
    public void execute() {
        previousUI.initUI();
        previousUI.loadUI();
    }
}
