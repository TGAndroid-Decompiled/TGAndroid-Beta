package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.n11;
public final class e2 implements Runnable {
    public final int f41723a;
    public final n2 f41724b;

    public e2(n2 n2Var, int i10) {
        this.f41723a = i10;
        this.f41724b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f41723a) {
            case 0:
                n2 n2Var = this.f41724b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f41851r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f41851r);
                        FileLoader.getInstance(n2Var.f41910a).cancelFileUpload(n2Var.W.f41838b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f41916d0.a();
                n2Var.f41916d0 = null;
                return;
            default:
                n2 n2Var2 = this.f41724b;
                n11 n11Var = n2Var2.S;
                if (n11Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(n11Var);
                    return;
                }
                return;
        }
    }
}
