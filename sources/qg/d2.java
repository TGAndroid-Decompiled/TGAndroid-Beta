package qg;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.m11;
public final class d2 implements Runnable {
    public final int f41591a;
    public final m2 f41592b;

    public d2(m2 m2Var, int i10) {
        this.f41591a = i10;
        this.f41592b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f41591a) {
            case 0:
                m2 m2Var = this.f41592b;
                k2 k2Var = m2Var.W;
                if (k2Var != null) {
                    if (k2Var.f41717r != null) {
                        MediaController.getInstance().cancelVideoConvert(m2Var.W.f41717r);
                        FileLoader.getInstance(m2Var.f41776a).cancelFileUpload(m2Var.W.f41704b, false);
                        m2Var.W.getClass();
                    }
                    m2Var.W.a();
                    m2Var.W = null;
                }
                m2Var.f41782d0.a();
                m2Var.f41782d0 = null;
                return;
            default:
                m2 m2Var2 = this.f41592b;
                m11 m11Var = m2Var2.S;
                if (m11Var != null) {
                    m2Var2.S = null;
                    m2Var2.removeView(m11Var);
                    return;
                }
                return;
        }
    }
}
