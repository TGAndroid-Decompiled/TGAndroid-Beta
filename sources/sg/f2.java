package sg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.g21;
public final class f2 implements Runnable {
    public final int f48207a;
    public final p2 f48208b;

    public f2(p2 p2Var, int i10) {
        this.f48207a = i10;
        this.f48208b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f48207a) {
            case 0:
                p2 p2Var = this.f48208b;
                n2 n2Var = p2Var.W;
                if (n2Var != null) {
                    if (n2Var.f48387r != null) {
                        MediaController.getInstance().cancelVideoConvert(p2Var.W.f48387r);
                        FileLoader.getInstance(p2Var.f48436a).cancelFileUpload(p2Var.W.f48374b, false);
                        p2Var.W.getClass();
                    }
                    p2Var.W.a();
                    p2Var.W = null;
                }
                p2Var.f48442d0.a();
                p2Var.f48442d0 = null;
                return;
            default:
                p2 p2Var2 = this.f48208b;
                g21 g21Var = p2Var2.S;
                if (g21Var != null) {
                    p2Var2.S = null;
                    p2Var2.removeView(g21Var);
                    return;
                }
                return;
        }
    }
}
