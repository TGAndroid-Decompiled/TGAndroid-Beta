package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.d21;
public final class d2 implements Runnable {
    public final int f46336a;
    public final n2 f46337b;

    public d2(n2 n2Var, int i10) {
        this.f46336a = i10;
        this.f46337b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f46336a) {
            case 0:
                n2 n2Var = this.f46337b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f46483r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f46483r);
                        FileLoader.getInstance(n2Var.f46543a).cancelFileUpload(n2Var.W.f46469b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f46549d0.a();
                n2Var.f46549d0 = null;
                return;
            default:
                n2 n2Var2 = this.f46337b;
                d21 d21Var = n2Var2.S;
                if (d21Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(d21Var);
                    return;
                }
                return;
        }
    }
}
