package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.c21;
public final class e2 implements Runnable {
    public final int f46237a;
    public final o2 f46238b;

    public e2(o2 o2Var, int i10) {
        this.f46237a = i10;
        this.f46238b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f46237a) {
            case 0:
                o2 o2Var = this.f46238b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.f46411r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.f46411r);
                        FileLoader.getInstance(o2Var.f46471a).cancelFileUpload(o2Var.W.f46397b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.f46477d0.a();
                o2Var.f46477d0 = null;
                return;
            default:
                o2 o2Var2 = this.f46238b;
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
