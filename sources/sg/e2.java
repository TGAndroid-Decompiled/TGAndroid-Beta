package sg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.h21;
public final class e2 implements Runnable {
    public final int f48233a;
    public final o2 f48234b;

    public e2(o2 o2Var, int i10) {
        this.f48233a = i10;
        this.f48234b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f48233a) {
            case 0:
                o2 o2Var = this.f48234b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.f48413r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.f48413r);
                        FileLoader.getInstance(o2Var.f48461a).cancelFileUpload(o2Var.W.f48400b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.f48467d0.a();
                o2Var.f48467d0 = null;
                return;
            default:
                o2 o2Var2 = this.f48234b;
                h21 h21Var = o2Var2.S;
                if (h21Var != null) {
                    o2Var2.S = null;
                    o2Var2.removeView(h21Var);
                    return;
                }
                return;
        }
    }
}
