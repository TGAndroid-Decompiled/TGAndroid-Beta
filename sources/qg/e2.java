package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.l11;
public final class e2 implements Runnable {
    public final int f41638a;
    public final n2 f41639b;

    public e2(n2 n2Var, int i10) {
        this.f41638a = i10;
        this.f41639b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f41638a) {
            case 0:
                n2 n2Var = this.f41639b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f41764r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f41764r);
                        FileLoader.getInstance(n2Var.f41823a).cancelFileUpload(n2Var.W.f41751b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f41829d0.a();
                n2Var.f41829d0 = null;
                return;
            default:
                n2 n2Var2 = this.f41639b;
                l11 l11Var = n2Var2.S;
                if (l11Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(l11Var);
                    return;
                }
                return;
        }
    }
}
