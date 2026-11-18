package tg;

import hi.t6;
public final class g2 implements Runnable {
    public final int f57889a;
    public final k2 f57890b;

    public g2(k2 k2Var, int i7) {
        this.f57889a = i7;
        this.f57890b = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f57889a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                org.telegram.messenger.g0.g3(new g2(this.f57890b, 0));
                return;
            case 2:
                this.f57890b.dismiss();
                return;
            default:
                k2 k2Var = this.f57890b;
                t6 t6Var = k2Var.I;
                if (t6Var != null) {
                    t6Var.a(null);
                    k2Var.I = null;
                }
                k2Var.dismiss();
                return;
        }
    }
}
