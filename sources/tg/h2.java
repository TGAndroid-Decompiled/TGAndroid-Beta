package tg;

import hi.t6;
public final class h2 implements Runnable {
    public final int f57912a;
    public final l2 f57913b;

    public h2(l2 l2Var, int i7) {
        this.f57912a = i7;
        this.f57913b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f57912a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                org.telegram.messenger.g0.g3(new h2(this.f57913b, 0));
                return;
            case 2:
                this.f57913b.dismiss();
                return;
            default:
                l2 l2Var = this.f57913b;
                t6 t6Var = l2Var.I;
                if (t6Var != null) {
                    t6Var.a(null);
                    l2Var.I = null;
                }
                l2Var.dismiss();
                return;
        }
    }
}
