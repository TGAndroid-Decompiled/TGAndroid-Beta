package tg;

import hi.g7;
public final class h2 implements Runnable {
    public final int f57329a;
    public final m2 f57330b;

    public h2(m2 m2Var, int i7) {
        this.f57329a = i7;
        this.f57330b = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f57329a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                org.telegram.messenger.g0.h3(new h2(this.f57330b, 0));
                return;
            case 2:
                this.f57330b.dismiss();
                return;
            default:
                m2 m2Var = this.f57330b;
                g7 g7Var = m2Var.I;
                if (g7Var != null) {
                    g7Var.a(null);
                    m2Var.I = null;
                }
                m2Var.dismiss();
                return;
        }
    }
}
