package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.y01;
public final class g2 implements Runnable {
    public final int f41394a;
    public final p2 f41395b;

    public g2(p2 p2Var, int i10) {
        this.f41394a = i10;
        this.f41395b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f41394a) {
            case 0:
                p2 p2Var = this.f41395b;
                n2 n2Var = p2Var.W;
                if (n2Var != null) {
                    if (n2Var.f41521r != null) {
                        MediaController.getInstance().cancelVideoConvert(p2Var.W.f41521r);
                        FileLoader.getInstance(p2Var.f41581a).cancelFileUpload(p2Var.W.f41508b, false);
                        p2Var.W.getClass();
                    }
                    p2Var.W.a();
                    p2Var.W = null;
                }
                p2Var.f41587d0.a();
                p2Var.f41587d0 = null;
                return;
            default:
                p2 p2Var2 = this.f41395b;
                y01 y01Var = p2Var2.S;
                if (y01Var != null) {
                    p2Var2.S = null;
                    p2Var2.removeView(y01Var);
                    return;
                }
                return;
        }
    }
}
