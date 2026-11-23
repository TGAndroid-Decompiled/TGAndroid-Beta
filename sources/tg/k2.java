package tg;

import hi.c7;
public final class k2 implements Runnable {
    public final int f58020a;
    public final o2 f58021b;

    public k2(o2 o2Var, int i7) {
        this.f58020a = i7;
        this.f58021b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f58020a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                org.telegram.messenger.g0.g3(new k2(this.f58021b, 0));
                return;
            case 2:
                this.f58021b.dismiss();
                return;
            default:
                o2 o2Var = this.f58021b;
                c7 c7Var = o2Var.I;
                if (c7Var != null) {
                    c7Var.a(null);
                    o2Var.I = null;
                }
                o2Var.dismiss();
                return;
        }
    }
}
