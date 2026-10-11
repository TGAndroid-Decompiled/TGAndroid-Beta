package pg;

import m.f3;
public final class p0 implements Runnable {
    public final int f45784a;
    public final s0 f45785b;

    public p0(s0 s0Var, int i10) {
        this.f45784a = i10;
        this.f45785b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f45784a) {
            case 0:
                s0 s0Var = this.f45785b;
                s0Var.f45825c = null;
                f3 f3Var = s0Var.f45823a;
                if (f3Var != null) {
                    f3Var.g();
                    return;
                }
                return;
            default:
                this.f45785b.b();
                return;
        }
    }
}
