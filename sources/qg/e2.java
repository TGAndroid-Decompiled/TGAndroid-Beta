package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.m11;
public final class e2 implements Runnable {
    public final int f41626a;
    public final n2 f41627b;

    public e2(n2 n2Var, int i10) {
        this.f41626a = i10;
        this.f41627b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f41626a) {
            case 0:
                n2 n2Var = this.f41627b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f41752r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f41752r);
                        FileLoader.getInstance(n2Var.f41811a).cancelFileUpload(n2Var.W.f41739b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f41817d0.a();
                n2Var.f41817d0 = null;
                return;
            default:
                n2 n2Var2 = this.f41627b;
                m11 m11Var = n2Var2.S;
                if (m11Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(m11Var);
                    return;
                }
                return;
        }
    }
}
