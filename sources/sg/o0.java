package sg;
public final class o0 implements Runnable {
    public final int f57353a;
    public final u0 f57354b;

    public o0(u0 u0Var, int i7) {
        this.f57353a = i7;
        this.f57354b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f57353a) {
            case 0:
                t0 t0Var = this.f57354b.f57401a;
                if (t0Var != null) {
                    t0Var.k();
                    return;
                }
                return;
            case 1:
                u0 u0Var = this.f57354b;
                u0Var.f57403c.a(u0Var.f57407r);
                s0 s0Var = u0Var.d;
                s0Var.getClass();
                s0Var.postRunnable(new r0(s0Var, 2));
                u0Var.d = null;
                return;
            default:
                u0 u0Var2 = this.f57354b;
                u0Var2.f57403c.q(u0Var2.f57411y);
                return;
        }
    }
}
