package tg;

import hi.s6;
public final class h2 implements Runnable {
    public final int f57947a;
    public final l2 f57948b;

    public h2(l2 l2Var, int i7) {
        this.f57947a = i7;
        this.f57948b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f57947a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                org.telegram.messenger.g0.g3(new h2(this.f57948b, 0));
                return;
            case 2:
                this.f57948b.dismiss();
                return;
            default:
                l2 l2Var = this.f57948b;
                s6 s6Var = l2Var.I;
                if (s6Var != null) {
                    s6Var.a(null);
                    l2Var.I = null;
                }
                l2Var.dismiss();
                return;
        }
    }
}
