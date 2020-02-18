package dialog;

import button.Button;

public abstract class Dialog {

    public void renderButton() {
        Button OKbutton = createButton();
        OKbutton.render();
        OKbutton.onClick();
    }

    // Это он и есть – фабричный метод
    abstract Button createButton();
}
