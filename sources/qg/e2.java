package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.i21;
public final class e2 implements Runnable {
    public final int f46176a;
    public final o2 f46177b;

    public e2(o2 o2Var, int i10) {
        this.f46176a = i10;
        this.f46177b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46176a) {
            case 0:
                o2 o2Var = this.f46177b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.f46350r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.f46350r);
                        FileLoader.getInstance(o2Var.f46410a).cancelFileUpload(o2Var.W.f46336b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.f46416d0.a();
                o2Var.f46416d0 = null;
                return;
            default:
                o2 o2Var2 = this.f46177b;
                i21 i21Var = o2Var2.S;
                if (i21Var != null) {
                    o2Var2.S = null;
                    o2Var2.removeView(i21Var);
                    return;
                }
                return;
        }
    }
}
