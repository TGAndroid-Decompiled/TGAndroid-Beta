package yf;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.d01;
public final class d2 implements Runnable {
    public final int f49788a;
    public final m2 f49789b;

    public d2(m2 m2Var, int i9) {
        this.f49788a = i9;
        this.f49789b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f49788a) {
            case 0:
                m2 m2Var = this.f49789b;
                k2 k2Var = m2Var.S;
                if (k2Var != null) {
                    if (k2Var.f49921r != null) {
                        MediaController.getInstance().cancelVideoConvert(m2Var.S.f49921r);
                        FileLoader.getInstance(m2Var.f49982a).cancelFileUpload(m2Var.S.f49907b, false);
                        m2Var.S.getClass();
                    }
                    m2Var.S.a();
                    m2Var.S = null;
                }
                m2Var.W.a();
                m2Var.W = null;
                return;
            default:
                m2 m2Var2 = this.f49789b;
                d01 d01Var = m2Var2.O;
                if (d01Var != null) {
                    m2Var2.O = null;
                    m2Var2.removeView(d01Var);
                    return;
                }
                return;
        }
    }
}
