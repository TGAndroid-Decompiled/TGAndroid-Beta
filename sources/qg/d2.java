package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.m11;
public final class d2 implements Runnable {
    public final int f41649a;
    public final n2 f41650b;

    public d2(n2 n2Var, int i10) {
        this.f41649a = i10;
        this.f41650b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f41649a) {
            case 0:
                n2 n2Var = this.f41650b;
                l2 l2Var = n2Var.W;
                if (l2Var != null) {
                    if (l2Var.f41789r != null) {
                        MediaController.getInstance().cancelVideoConvert(n2Var.W.f41789r);
                        FileLoader.getInstance(n2Var.f41847a).cancelFileUpload(n2Var.W.f41776b, false);
                        n2Var.W.getClass();
                    }
                    n2Var.W.a();
                    n2Var.W = null;
                }
                n2Var.f41853d0.a();
                n2Var.f41853d0 = null;
                return;
            default:
                n2 n2Var2 = this.f41650b;
                m11 m11Var = n2Var2.S;
                if (m11Var != null) {
                    n2Var2.S = null;
                    n2Var2.removeView(m11Var);
                    return;
                }
                return;
        }
    }
}
