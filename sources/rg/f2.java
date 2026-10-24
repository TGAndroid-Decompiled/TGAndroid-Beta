package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.x11;
public final class f2 implements Runnable {
    public final int f45775a;
    public final o2 f45776b;

    public f2(o2 o2Var, int i10) {
        this.f45775a = i10;
        this.f45776b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f45775a) {
            case 0:
                o2 o2Var = this.f45776b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.f45937r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.f45937r);
                        FileLoader.getInstance(o2Var.f45985a).cancelFileUpload(o2Var.W.f45924b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.f45991d0.a();
                o2Var.f45991d0 = null;
                return;
            default:
                o2 o2Var2 = this.f45776b;
                x11 x11Var = o2Var2.S;
                if (x11Var != null) {
                    o2Var2.S = null;
                    o2Var2.removeView(x11Var);
                    return;
                }
                return;
        }
    }
}
