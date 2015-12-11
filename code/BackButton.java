package MockCommand;

/**
 * Created by Marshall on 12/10/2015.
 * Concrete Invoker
 */
public class BackButton implements Invoker {

    Command command;

    public BackButton(Command newCommand) {
        this.command = newCommand;
    }

    @Override
    public void pressed() {
        command.execute();
    }
}
