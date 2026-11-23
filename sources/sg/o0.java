package sg;
public final class o0 implements Runnable {
    public final int f57318a;
    public final u0 f57319b;

    public o0(u0 u0Var, int i7) {
        this.f57318a = i7;
        this.f57319b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f57318a) {
            case 0:
                t0 t0Var = this.f57319b.f57366a;
                if (t0Var != null) {
                    t0Var.k();
                    return;
                }
                return;
            case 1:
                u0 u0Var = this.f57319b;
                u0Var.f57368c.a(u0Var.f57372r);
                s0 s0Var = u0Var.d;
                s0Var.getClass();
                s0Var.postRunnable(new r0(s0Var, 2));
                u0Var.d = null;
                return;
            default:
                u0 u0Var2 = this.f57319b;
                u0Var2.f57368c.q(u0Var2.f57376y);
                return;
        }
    }
}
