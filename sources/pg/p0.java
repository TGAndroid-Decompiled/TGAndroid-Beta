package pg;

import m.f3;
public final class p0 implements Runnable {
    public final int f45716a;
    public final s0 f45717b;

    public p0(s0 s0Var, int i10) {
        this.f45716a = i10;
        this.f45717b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f45716a) {
            case 0:
                s0 s0Var = this.f45717b;
                s0Var.f45757c = null;
                f3 f3Var = s0Var.f45755a;
                if (f3Var != null) {
                    f3Var.g();
                    return;
                }
                return;
            default:
                this.f45717b.b();
                return;
        }
    }
}
