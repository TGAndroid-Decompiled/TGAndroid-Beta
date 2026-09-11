package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.w01;
public final class f2 implements Runnable {
    public final int f45184a;
    public final o2 f45185b;

    public f2(o2 o2Var, int i10) {
        this.f45184a = i10;
        this.f45185b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f45184a) {
            case 0:
                o2 o2Var = this.f45185b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.f45316r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.f45316r);
                        FileLoader.getInstance(o2Var.f45377a).cancelFileUpload(o2Var.W.f45302b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.f45383d0.a();
                o2Var.f45383d0 = null;
                return;
            default:
                o2 o2Var2 = this.f45185b;
                w01 w01Var = o2Var2.S;
                if (w01Var != null) {
                    o2Var2.S = null;
                    o2Var2.removeView(w01Var);
                    return;
                }
                return;
        }
    }
}
