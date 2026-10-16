package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.z11;
public final class f2 implements Runnable {
    public final int f44012a;
    public final p2 f44013b;

    public f2(p2 p2Var, int i10) {
        this.f44012a = i10;
        this.f44013b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f44012a) {
            case 0:
                p2 p2Var = this.f44013b;
                n2 n2Var = p2Var.W;
                if (n2Var != null) {
                    if (n2Var.f44153r != null) {
                        MediaController.getInstance().cancelVideoConvert(p2Var.W.f44153r);
                        FileLoader.getInstance(p2Var.f44212a).cancelFileUpload(p2Var.W.f44140b, false);
                        p2Var.W.getClass();
                    }
                    p2Var.W.a();
                    p2Var.W = null;
                }
                p2Var.f44218d0.a();
                p2Var.f44218d0 = null;
                return;
            default:
                p2 p2Var2 = this.f44013b;
                z11 z11Var = p2Var2.S;
                if (z11Var != null) {
                    p2Var2.S = null;
                    p2Var2.removeView(z11Var);
                    return;
                }
                return;
        }
    }
}
