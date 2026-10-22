package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.v11;
public final class e2 implements Runnable {
    public final int f45346a;
    public final n2 f45347b;

    public e2(n2 n2Var, int i10) {
        this.f45346a = i10;
        this.f45347b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f45346a) {
            case 0:
                n2 n2Var = this.f45347b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f45470r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f45470r);
                        FileLoader.getInstance(n2Var.f45528a).cancelFileUpload(n2Var.W.f45457b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f45534d0.a();
                n2Var.f45534d0 = null;
                return;
            default:
                n2 n2Var2 = this.f45347b;
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
