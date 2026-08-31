package qh;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class i0 implements Runnable {
    public final int f45398a;
    public final n0 f45399b;
    public final File f45400c;

    public i0(n0 n0Var, File file, int i10) {
        this.f45398a = i10;
        this.f45399b = n0Var;
        this.f45400c = file;
    }

    @Override
    public final void run() {
        switch (this.f45398a) {
            case 0:
                n0 n0Var = this.f45399b;
                if (n0Var.f45747c && n0Var.f45751r != null) {
                    MediaController.saveFile(this.f45400c.getAbsolutePath(), n0Var.getContext(), 1, null, null, new j0(n0Var, 1), false);
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f45399b;
                s6 s6Var = n0Var2.f45751r;
                File file = this.f45400c;
                s6Var.c(file);
                if (n0Var2.f45747c && n0Var2.f45751r != null) {
                    AndroidUtilities.runOnUIThread(new i0(n0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f45400c.getAbsolutePath();
                n0 n0Var3 = this.f45399b;
                MediaController.saveFile(absolutePath, n0Var3.getContext(), 0, null, null, new j0(n0Var3, 2), false);
                return;
        }
    }
}
