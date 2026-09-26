package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.k11;
public final class e2 implements Runnable {
    public final int f41624a;
    public final n2 f41625b;

    public e2(n2 n2Var, int i10) {
        this.f41624a = i10;
        this.f41625b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f41624a) {
            case 0:
                n2 n2Var = this.f41625b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f41750r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f41750r);
                        FileLoader.getInstance(n2Var.f41809a).cancelFileUpload(n2Var.W.f41737b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f41815d0.a();
                n2Var.f41815d0 = null;
                return;
            default:
                n2 n2Var2 = this.f41625b;
                k11 k11Var = n2Var2.S;
                if (k11Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(k11Var);
                    return;
                }
                return;
        }
    }
}
