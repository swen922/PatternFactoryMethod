package button;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("this is Windows button");
    }

    @Override
    public void onClick() {
        System.out.println("Click Windows button");
    }
}
