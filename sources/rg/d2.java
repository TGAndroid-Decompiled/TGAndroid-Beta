package rg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.t11;
public final class d2 implements Runnable {
    public final int f45320a;
    public final m2 f45321b;

    public d2(m2 m2Var, int i10) {
        this.f45320a = i10;
        this.f45321b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f45320a) {
            case 0:
                m2 m2Var = this.f45321b;
                k2 k2Var = m2Var.W;
                if (k2Var != null) {
                    if (k2Var.f45446r != null) {
                        MediaController.getInstance().cancelVideoConvert(m2Var.W.f45446r);
                        FileLoader.getInstance(m2Var.f45505a).cancelFileUpload(m2Var.W.f45433b, false);
                        m2Var.W.getClass();
                    }
                    m2Var.W.a();
                    m2Var.W = null;
                }
                m2Var.f45511d0.a();
                m2Var.f45511d0 = null;
                return;
            default:
                m2 m2Var2 = this.f45321b;
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
