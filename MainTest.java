package MockCommand;

/**
 * Created by Marshall on 12/10/2015.
 */
public class MainTest {

    public static void main(String[] args) {
        AppInterface previousPage = new ChooseUI();
        AppInterface nextPage = new PayUI();
        AppInterface currentPage = new ConfirmUI();

        // Go to payment UI
        Command confirm = new ConfirmCommand(nextPage);
        ConfirmButton confirmButton = new ConfirmButton(confirm);
        confirmButton.pressed();
        // Go back to choose UI
        Command choose = new BackCommand(previousPage);
        confirmButton = new ConfirmButton(choose);
        confirmButton.pressed();
    }
}
