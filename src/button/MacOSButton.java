package button;

public class MacOSButton implements Button {

    @Override
    public void render() {
        System.out.println("this is Mac button");
    }

    @Override
    public void onClick() {
        System.out.println("Click Mac button");
    }
}
