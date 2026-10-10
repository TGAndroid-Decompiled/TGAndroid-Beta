package pg;

import m.f3;
public final class p0 implements Runnable {
    public final int f45760a;
    public final s0 f45761b;

    public p0(s0 s0Var, int i10) {
        this.f45760a = i10;
        this.f45761b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f45760a) {
            case 0:
                s0 s0Var = this.f45761b;
                s0Var.f45801c = null;
                f3 f3Var = s0Var.f45799a;
                if (f3Var != null) {
                    f3Var.g();
                    return;
                }
                return;
            default:
                this.f45761b.b();
                return;
        }
    }
}
