package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.w01;
public final class f2 implements Runnable {
    public final int f45213a;
    public final o2 f45214b;

    public f2(o2 o2Var, int i10) {
        this.f45213a = i10;
        this.f45214b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f45213a) {
            case 0:
                o2 o2Var = this.f45214b;
                m2 m2Var = o2Var.W;
                if (m2Var != null) {
                    if (m2Var.f45345r != null) {
                        MediaController.getInstance().cancelVideoConvert(o2Var.W.f45345r);
                        FileLoader.getInstance(o2Var.f45406a).cancelFileUpload(o2Var.W.f45331b, false);
                        o2Var.W.getClass();
                    }
                    o2Var.W.a();
                    o2Var.W = null;
                }
                o2Var.f45412d0.a();
                o2Var.f45412d0 = null;
                return;
            default:
                o2 o2Var2 = this.f45214b;
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
