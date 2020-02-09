package dialog;

import button.Button;
import button.LinuxButton;

public class LinuxDialog extends Dialog {

    @Override
    Button createButton() {
        return new LinuxButton();
    }
}
