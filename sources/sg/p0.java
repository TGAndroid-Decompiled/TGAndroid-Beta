package sg;
public final class p0 implements Runnable {
    public final int f55188a;
    public final v0 f55189b;

    public p0(v0 v0Var, int i7) {
        this.f55188a = i7;
        this.f55189b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f55188a) {
            case 0:
                u0 u0Var = this.f55189b.f55233a;
                if (u0Var != null) {
                    u0Var.o();
                    return;
                }
                return;
            case 1:
                v0 v0Var = this.f55189b;
                v0Var.f55235c.a(v0Var.f55239r);
                t0 t0Var = v0Var.d;
                t0Var.getClass();
                t0Var.postRunnable(new s0(t0Var, 2));
                v0Var.d = null;
                return;
            default:
                v0 v0Var2 = this.f55189b;
                v0Var2.f55235c.q(v0Var2.f55243y);
                return;
        }
    }
}
