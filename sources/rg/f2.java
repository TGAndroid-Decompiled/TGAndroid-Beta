package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.y11;
public final class f2 implements Runnable {
    public final int f44253a;
    public final p2 f44254b;

    public f2(p2 p2Var, int i10) {
        this.f44253a = i10;
        this.f44254b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f44253a) {
            case 0:
                p2 p2Var = this.f44254b;
                n2 n2Var = p2Var.W;
                if (n2Var != null) {
                    if (n2Var.f44394r != null) {
                        MediaController.getInstance().cancelVideoConvert(p2Var.W.f44394r);
                        FileLoader.getInstance(p2Var.f44453a).cancelFileUpload(p2Var.W.f44381b, false);
                        p2Var.W.getClass();
                    }
                    p2Var.W.a();
                    p2Var.W = null;
                }
                p2Var.f44459d0.a();
                p2Var.f44459d0 = null;
                return;
            default:
                p2 p2Var2 = this.f44254b;
                y11 y11Var = p2Var2.S;
                if (y11Var != null) {
                    p2Var2.S = null;
                    p2Var2.removeView(y11Var);
                    return;
                }
                return;
        }
    }
}
