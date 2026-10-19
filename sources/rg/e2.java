package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.u11;
public final class e2 implements Runnable {
    public final int f45333a;
    public final n2 f45334b;

    public e2(n2 n2Var, int i10) {
        this.f45333a = i10;
        this.f45334b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f45333a) {
            case 0:
                n2 n2Var = this.f45334b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f45457r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f45457r);
                        FileLoader.getInstance(n2Var.f45515a).cancelFileUpload(n2Var.W.f45444b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f45521d0.a();
                n2Var.f45521d0 = null;
                return;
            default:
                n2 n2Var2 = this.f45334b;
                u11 u11Var = n2Var2.S;
                if (u11Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(u11Var);
                    return;
                }
                return;
        }
    }
}
