package ph;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class i0 implements Runnable {
    public final int f41730a;
    public final n0 f41731b;
    public final File f41732c;

    public i0(n0 n0Var, File file, int i10) {
        this.f41730a = i10;
        this.f41731b = n0Var;
        this.f41732c = file;
    }

    @Override
    public final void run() {
        switch (this.f41730a) {
            case 0:
                n0 n0Var = this.f41731b;
                if (n0Var.f41989c && n0Var.f41992r != null) {
                    MediaController.saveFile(this.f41732c.getAbsolutePath(), n0Var.getContext(), 1, null, null, new j0(n0Var, 1), false);
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f41731b;
                u6 u6Var = n0Var2.f41992r;
                File file = this.f41732c;
                u6Var.c(file);
                if (n0Var2.f41989c && n0Var2.f41992r != null) {
                    AndroidUtilities.runOnUIThread(new i0(n0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f41732c.getAbsolutePath();
                n0 n0Var3 = this.f41731b;
                MediaController.saveFile(absolutePath, n0Var3.getContext(), 0, null, null, new j0(n0Var3, 2), false);
                return;
        }
    }
}
