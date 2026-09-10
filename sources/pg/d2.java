package pg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.k11;
public final class d2 implements Runnable {
    public final int f39977a;
    public final n2 f39978b;

    public d2(n2 n2Var, int i10) {
        this.f39977a = i10;
        this.f39978b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f39977a) {
            case 0:
                n2 n2Var = this.f39978b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f40117r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f40117r);
                        FileLoader.getInstance(n2Var.f40175a).cancelFileUpload(n2Var.W.f40104b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f40181d0.a();
                n2Var.f40181d0 = null;
                return;
            default:
                n2 n2Var2 = this.f39978b;
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
