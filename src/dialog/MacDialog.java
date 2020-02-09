package dialog;

import button.Button;
import button.MacOSButton;

public class MacDialog extends Dialog {

    @Override
    Button createButton() {
        return new MacOSButton();
    }
}
