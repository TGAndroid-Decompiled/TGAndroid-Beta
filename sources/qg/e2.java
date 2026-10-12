package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.i21;
public final class e2 implements Runnable {
    public final int f46184a;
    public final o2 f46185b;

    public e2(o2 o2Var, int i10) {
        this.f46184a = i10;
        this.f46185b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46184a) {
            case 0:
                o2 o2Var = this.f46185b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.f46358r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.f46358r);
                        FileLoader.getInstance(o2Var.f46418a).cancelFileUpload(o2Var.W.f46344b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.f46424d0.a();
                o2Var.f46424d0 = null;
                return;
            default:
                o2 o2Var2 = this.f46185b;
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
