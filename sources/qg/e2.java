package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.c21;
public final class e2 implements Runnable {
    public final int f46239a;
    public final o2 f46240b;

    public e2(o2 o2Var, int i10) {
        this.f46239a = i10;
        this.f46240b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46239a) {
            case 0:
                o2 o2Var = this.f46240b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.f46413r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.f46413r);
                        FileLoader.getInstance(o2Var.f46473a).cancelFileUpload(o2Var.W.f46399b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.f46479d0.a();
                o2Var.f46479d0 = null;
                return;
            default:
                o2 o2Var2 = this.f46240b;
                c21 c21Var = o2Var2.S;
                if (c21Var != null) {
                    o2Var2.S = null;
                    o2Var2.removeView(c21Var);
                    return;
                }
                return;
        }
    }
}
