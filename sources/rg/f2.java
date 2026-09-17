package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.w01;
public final class f2 implements Runnable {
    public final int f45185a;
    public final o2 f45186b;

    public f2(o2 o2Var, int i10) {
        this.f45185a = i10;
        this.f45186b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f45185a) {
            case 0:
                o2 o2Var = this.f45186b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.f45317r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.f45317r);
                        FileLoader.getInstance(o2Var.f45378a).cancelFileUpload(o2Var.W.f45303b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.f45384d0.a();
                o2Var.f45384d0 = null;
                return;
            default:
                o2 o2Var2 = this.f45186b;
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
