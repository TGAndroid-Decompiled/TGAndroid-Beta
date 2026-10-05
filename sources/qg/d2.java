package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.w11;
public final class d2 implements Runnable {
    public final int f45015a;
    public final n2 f45016b;

    public d2(n2 n2Var, int i10) {
        this.f45015a = i10;
        this.f45016b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f45015a) {
            case 0:
                n2 n2Var = this.f45016b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f45164r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f45164r);
                        FileLoader.getInstance(n2Var.f45224a).cancelFileUpload(n2Var.W.f45150b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f45230d0.a();
                n2Var.f45230d0 = null;
                return;
            default:
                n2 n2Var2 = this.f45016b;
                w11 w11Var = n2Var2.S;
                if (w11Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(w11Var);
                    return;
                }
                return;
        }
    }
}
