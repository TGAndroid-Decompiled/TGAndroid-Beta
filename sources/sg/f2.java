package sg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.g21;
public final class f2 implements Runnable {
    public final int f48204a;
    public final p2 f48205b;

    public f2(p2 p2Var, int i10) {
        this.f48204a = i10;
        this.f48205b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f48204a) {
            case 0:
                p2 p2Var = this.f48205b;
                n2 n2Var = p2Var.W;
                if (n2Var != null) {
                    if (n2Var.f48384r != null) {
                        MediaController.getInstance().cancelVideoConvert(p2Var.W.f48384r);
                        FileLoader.getInstance(p2Var.f48433a).cancelFileUpload(p2Var.W.f48371b, false);
                        p2Var.W.getClass();
                    }
                    p2Var.W.a();
                    p2Var.W = null;
                }
                p2Var.f48439d0.a();
                p2Var.f48439d0 = null;
                return;
            default:
                p2 p2Var2 = this.f48205b;
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
