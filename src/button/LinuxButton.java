package button;

public class LinuxButton implements Button {

    @Override
    public void render() {
        System.out.println("this is Linux button");
    }

    @Override
    public void onClick() {
        System.out.println("Click Linux button");
    }
}
