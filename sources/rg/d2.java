package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.t11;
public final class d2 implements Runnable {
    public final int f45346a;
    public final m2 f45347b;

    public d2(m2 m2Var, int i10) {
        this.f45346a = i10;
        this.f45347b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f45346a) {
            case 0:
                m2 m2Var = this.f45347b;
                k2 k2Var = m2Var.W;
                if (k2Var != null) {
                    if (k2Var.f45472r != null) {
                        MediaController.getInstance().cancelVideoConvert(m2Var.W.f45472r);
                        FileLoader.getInstance(m2Var.f45531a).cancelFileUpload(m2Var.W.f45459b, false);
                        m2Var.W.getClass();
                    }
                    m2Var.W.a();
                    m2Var.W = null;
                }
                m2Var.f45537d0.a();
                m2Var.f45537d0 = null;
                return;
            default:
                m2 m2Var2 = this.f45347b;
                t11 t11Var = m2Var2.S;
                if (t11Var != null) {
                    m2Var2.S = null;
                    m2Var2.removeView(t11Var);
                    return;
                }
                return;
        }
    }
}
