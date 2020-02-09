package dialog;

import button.Button;

public abstract class Dialog {

    public void renderButton() {
        Button OKbutton = createButton();
        OKbutton.render();
        OKbutton.onClick();
    }

    abstract Button createButton();
}
