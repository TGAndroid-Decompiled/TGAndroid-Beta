package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.d21;
public final class e2 implements Runnable {
    public final int f46283a;
    public final o2 f46284b;

    public e2(o2 o2Var, int i10) {
        this.f46283a = i10;
        this.f46284b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46283a) {
            case 0:
                o2 o2Var = this.f46284b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.f46457r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.f46457r);
                        FileLoader.getInstance(o2Var.f46517a).cancelFileUpload(o2Var.W.f46443b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.f46523d0.a();
                o2Var.f46523d0 = null;
                return;
            default:
                o2 o2Var2 = this.f46284b;
                d21 d21Var = o2Var2.S;
                if (d21Var != null) {
                    o2Var2.S = null;
                    o2Var2.removeView(d21Var);
                    return;
                }
                return;
        }
    }
}
