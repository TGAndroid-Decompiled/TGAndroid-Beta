package pg;

import m.f3;
public final class p0 implements Runnable {
    public final int f45714a;
    public final s0 f45715b;

    public p0(s0 s0Var, int i10) {
        this.f45714a = i10;
        this.f45715b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f45714a) {
            case 0:
                s0 s0Var = this.f45715b;
                s0Var.f45755c = null;
                f3 f3Var = s0Var.f45753a;
                if (f3Var != null) {
                    f3Var.g();
                    return;
                }
                return;
            default:
                this.f45715b.b();
                return;
        }
    }
}
