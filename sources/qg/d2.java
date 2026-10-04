package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.v11;
public final class d2 implements Runnable {
    public final int f45001a;
    public final n2 f45002b;

    public d2(n2 n2Var, int i10) {
        this.f45001a = i10;
        this.f45002b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f45001a) {
            case 0:
                n2 n2Var = this.f45002b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f45150r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f45150r);
                        FileLoader.getInstance(n2Var.f45210a).cancelFileUpload(n2Var.W.f45136b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f45216d0.a();
                n2Var.f45216d0 = null;
                return;
            default:
                n2 n2Var2 = this.f45002b;
                v11 v11Var = n2Var2.S;
                if (v11Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(v11Var);
                    return;
                }
                return;
        }
    }
}
