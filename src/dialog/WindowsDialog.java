package dialog;

import button.Button;
import button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
