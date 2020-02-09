public class Run {

    public static void main(String[] args) {
        App app = new App();
        app.initialize();
        if (app.getDialog() != null) {
            app.getDialog().renderButton();
        }
    }
}
