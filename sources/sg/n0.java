package sg;
public final class n0 implements Runnable {
    public final int f57419a;
    public final t0 f57420b;

    public n0(t0 t0Var, int i7) {
        this.f57419a = i7;
        this.f57420b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f57419a) {
            case 0:
                s0 s0Var = this.f57420b.f57469a;
                if (s0Var != null) {
                    s0Var.l();
                    return;
                }
                return;
            case 1:
                t0 t0Var = this.f57420b;
                t0Var.f57471c.a(t0Var.f57475r);
                r0 r0Var = t0Var.d;
                r0Var.getClass();
                r0Var.postRunnable(new q0(r0Var, 2));
                t0Var.d = null;
                return;
            default:
                t0 t0Var2 = this.f57420b;
                t0Var2.f57471c.q(t0Var2.f57479y);
                return;
        }
    }
}
