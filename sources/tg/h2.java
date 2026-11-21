package tg;

import hi.s6;
public final class h2 implements Runnable {
    public final int f57943a;
    public final l2 f57944b;

    public h2(l2 l2Var, int i7) {
        this.f57943a = i7;
        this.f57944b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f57943a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                org.telegram.messenger.g0.g3(new h2(this.f57944b, 0));
                return;
            case 2:
                this.f57944b.dismiss();
                return;
            default:
                l2 l2Var = this.f57944b;
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
