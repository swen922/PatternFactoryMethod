public class Run {

    /**  Фабричный метод, также известен как: Виртуальный конструктор, Factory Method */

    public static void main(String[] args) {
        App app = new App();
        app.initialize();
        if (app.getDialog() != null) {
            app.getDialog().renderButton();
        }
    }
}
