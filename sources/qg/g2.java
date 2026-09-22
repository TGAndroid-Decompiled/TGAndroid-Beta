package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.x01;
public final class g2 implements Runnable {
    public final int f41363a;
    public final p2 f41364b;

    public g2(p2 p2Var, int i10) {
        this.f41363a = i10;
        this.f41364b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f41363a) {
            case 0:
                p2 p2Var = this.f41364b;
                n2 n2Var = p2Var.W;
                if (n2Var != null) {
                    if (n2Var.f41490r != null) {
                        MediaController.getInstance().cancelVideoConvert(p2Var.W.f41490r);
                        FileLoader.getInstance(p2Var.f41550a).cancelFileUpload(p2Var.W.f41477b, false);
                        p2Var.W.getClass();
                    }
                    p2Var.W.a();
                    p2Var.W = null;
                }
                p2Var.f41556d0.a();
                p2Var.f41556d0 = null;
                return;
            default:
                p2 p2Var2 = this.f41364b;
                x01 x01Var = p2Var2.S;
                if (x01Var != null) {
                    p2Var2.S = null;
                    p2Var2.removeView(x01Var);
                    return;
                }
                return;
        }
    }
}
