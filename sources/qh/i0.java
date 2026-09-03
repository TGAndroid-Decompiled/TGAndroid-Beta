package qh;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class i0 implements Runnable {
    public final int f45421a;
    public final n0 f45422b;
    public final File f45423c;

    public i0(n0 n0Var, File file, int i10) {
        this.f45421a = i10;
        this.f45422b = n0Var;
        this.f45423c = file;
    }

    @Override
    public final void run() {
        switch (this.f45421a) {
            case 0:
                n0 n0Var = this.f45422b;
                if (n0Var.f45784c && n0Var.f45788r != null) {
                    MediaController.saveFile(this.f45423c.getAbsolutePath(), n0Var.getContext(), 1, null, null, new j0(n0Var, 1), false);
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f45422b;
                r6 r6Var = n0Var2.f45788r;
                File file = this.f45423c;
                r6Var.c(file);
                if (n0Var2.f45784c && n0Var2.f45788r != null) {
                    AndroidUtilities.runOnUIThread(new i0(n0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f45423c.getAbsolutePath();
                n0 n0Var3 = this.f45422b;
                MediaController.saveFile(absolutePath, n0Var3.getContext(), 0, null, null, new j0(n0Var3, 2), false);
                return;
        }
    }
}
