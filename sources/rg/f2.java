package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.y11;
public final class f2 implements Runnable {
    public final int f45776a;
    public final o2 f45777b;

    public f2(o2 o2Var, int i10) {
        this.f45776a = i10;
        this.f45777b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f45776a) {
            case 0:
                o2 o2Var = this.f45777b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.f45938r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.f45938r);
                        FileLoader.getInstance(o2Var.f45986a).cancelFileUpload(o2Var.W.f45925b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.f45992d0.a();
                o2Var.f45992d0 = null;
                return;
            default:
                o2 o2Var2 = this.f45777b;
                y11 y11Var = o2Var2.S;
                if (y11Var != null) {
                    o2Var2.S = null;
                    o2Var2.removeView(y11Var);
                    return;
                }
                return;
        }
    }
}
