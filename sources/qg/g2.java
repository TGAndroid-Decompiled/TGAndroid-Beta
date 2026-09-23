package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.w01;
public final class g2 implements Runnable {
    public final int f41319a;
    public final p2 f41320b;

    public g2(p2 p2Var, int i10) {
        this.f41319a = i10;
        this.f41320b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f41319a) {
            case 0:
                p2 p2Var = this.f41320b;
                n2 n2Var = p2Var.W;
                if (n2Var != null) {
                    if (n2Var.f41446r != null) {
                        MediaController.getInstance().cancelVideoConvert(p2Var.W.f41446r);
                        FileLoader.getInstance(p2Var.f41506a).cancelFileUpload(p2Var.W.f41433b, false);
                        p2Var.W.getClass();
                    }
                    p2Var.W.a();
                    p2Var.W = null;
                }
                p2Var.f41512d0.a();
                p2Var.f41512d0 = null;
                return;
            default:
                p2 p2Var2 = this.f41320b;
                w01 w01Var = p2Var2.S;
                if (w01Var != null) {
                    p2Var2.S = null;
                    p2Var2.removeView(w01Var);
                    return;
                }
                return;
        }
    }
}
