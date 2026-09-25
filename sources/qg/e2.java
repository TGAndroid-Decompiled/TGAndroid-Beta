package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.k11;
public final class e2 implements Runnable {
    public final int f41625a;
    public final n2 f41626b;

    public e2(n2 n2Var, int i10) {
        this.f41625a = i10;
        this.f41626b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f41625a) {
            case 0:
                n2 n2Var = this.f41626b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f41751r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f41751r);
                        FileLoader.getInstance(n2Var.f41810a).cancelFileUpload(n2Var.W.f41738b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f41816d0.a();
                n2Var.f41816d0 = null;
                return;
            default:
                n2 n2Var2 = this.f41626b;
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
