package pg;

import m.f3;
public final class p0 implements Runnable {
    public final int f45750a;
    public final s0 f45751b;

    public p0(s0 s0Var, int i10) {
        this.f45750a = i10;
        this.f45751b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f45750a) {
            case 0:
                s0 s0Var = this.f45751b;
                s0Var.f45791c = null;
                f3 f3Var = s0Var.f45789a;
                if (f3Var != null) {
                    f3Var.g();
                    return;
                }
                return;
            default:
                this.f45751b.b();
                return;
        }
    }
}
