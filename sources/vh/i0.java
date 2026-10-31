package vh;

import java.io.File;
import org.telegram.messenger.MediaController;
public final class i0 implements Runnable {
    public final int f51269a;
    public final n0 f51270b;
    public final File f51271c;

    public i0(n0 n0Var, File file, int i10) {
        this.f51269a = i10;
        this.f51270b = n0Var;
        this.f51271c = file;
    }

    @Override
    public final void run() {
        switch (this.f51269a) {
            case 0:
                n0 n0Var = this.f51270b;
                if (n0Var.f51491c && n0Var.f51494r != null) {
                    MediaController.d0(this.f51271c.getAbsolutePath(), n0Var.getContext(), 1, null, null, new j0(n0Var, 1));
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f51270b;
                n5 n5Var = n0Var2.f51494r;
                File file = this.f51271c;
                n5Var.c(file);
                if (n0Var2.f51491c && n0Var2.f51494r != null) {
                    org.telegram.messenger.i0.g3(new i0(n0Var2, file, 2));
                    return;
                }
                return;
            default:
                String absolutePath = this.f51271c.getAbsolutePath();
                n0 n0Var3 = this.f51270b;
                MediaController.d0(absolutePath, n0Var3.getContext(), 0, null, null, new j0(n0Var3, 2));
                return;
        }
    }
}
