package ph;

import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class i0 implements Runnable {
    public final int f41765a;
    public final n0 f41766b;
    public final File f41767c;

    public i0(n0 n0Var, File file, int i10) {
        this.f41765a = i10;
        this.f41766b = n0Var;
        this.f41767c = file;
    }

    @Override
    public final void run() {
        switch (this.f41765a) {
            case 0:
                n0 n0Var = this.f41766b;
                if (n0Var.f42028c && n0Var.f42031r != null) {
                    MediaController.saveFile(this.f41767c.getAbsolutePath(), n0Var.getContext(), 1, null, null, new j0(n0Var, 1), false);
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f41766b;
                t6 t6Var = n0Var2.f42031r;
                File file = this.f41767c;
                t6Var.c(file);
                if (n0Var2.f42028c && n0Var2.f42031r != null) {
                    AndroidUtilities.runOnUIThread(new i0(n0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f41767c.getAbsolutePath();
                n0 n0Var3 = this.f41766b;
                MediaController.saveFile(absolutePath, n0Var3.getContext(), 0, null, null, new j0(n0Var3, 2), false);
                return;
        }
    }
}
