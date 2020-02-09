import dialog.Dialog;
import dialog.LinuxDialog;
import dialog.MacDialog;
import dialog.WindowsDialog;

public class App {

    private Dialog dialog;

    public Dialog getDialog() {
        return dialog;
    }

    public void initialize() {
        if (getOSType() == OStype.WIN) {
            this.dialog = new WindowsDialog();
        }
        else if (getOSType() == OStype.MAC) {
            this.dialog = new MacDialog();
        }
        else if (getOSType() == OStype.LINUX) {
            this.dialog = new LinuxDialog();
        }
        else {
            System.out.println("Can't initialize dialog");
        }
    }

    private OStype getOSType() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            return OStype.WIN;
        }
        else if (os.contains("mac")) {
            return OStype.MAC;
        }
        else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
            return OStype.LINUX;
        }
        return null;
    }

}
