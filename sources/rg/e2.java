package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.v11;
public final class e2 implements Runnable {
    public final int f45347a;
    public final n2 f45348b;

    public e2(n2 n2Var, int i10) {
        this.f45347a = i10;
        this.f45348b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f45347a) {
            case 0:
                n2 n2Var = this.f45348b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f45471r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f45471r);
                        FileLoader.getInstance(n2Var.f45529a).cancelFileUpload(n2Var.W.f45458b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f45535d0.a();
                n2Var.f45535d0 = null;
                return;
            default:
                n2 n2Var2 = this.f45348b;
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
