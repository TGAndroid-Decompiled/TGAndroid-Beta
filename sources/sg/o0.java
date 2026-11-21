package sg;
public final class o0 implements Runnable {
    public final int f57349a;
    public final u0 f57350b;

    public o0(u0 u0Var, int i7) {
        this.f57349a = i7;
        this.f57350b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f57349a) {
            case 0:
                t0 t0Var = this.f57350b.f57397a;
                if (t0Var != null) {
                    t0Var.k();
                    return;
                }
                return;
            case 1:
                u0 u0Var = this.f57350b;
                u0Var.f57399c.a(u0Var.f57403r);
                s0 s0Var = u0Var.d;
                s0Var.getClass();
                s0Var.postRunnable(new r0(s0Var, 2));
                u0Var.d = null;
                return;
            default:
                u0 u0Var2 = this.f57350b;
                u0Var2.f57399c.q(u0Var2.f57407y);
                return;
        }
    }
}
