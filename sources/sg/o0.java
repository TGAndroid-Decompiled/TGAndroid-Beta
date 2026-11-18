package sg;
public final class o0 implements Runnable {
    public final int f57308a;
    public final u0 f57309b;

    public o0(u0 u0Var, int i7) {
        this.f57308a = i7;
        this.f57309b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f57308a) {
            case 0:
                t0 t0Var = this.f57309b.f57356a;
                if (t0Var != null) {
                    t0Var.k();
                    return;
                }
                return;
            case 1:
                u0 u0Var = this.f57309b;
                u0Var.f57358c.a(u0Var.f57362r);
                s0 s0Var = u0Var.d;
                s0Var.getClass();
                s0Var.postRunnable(new r0(s0Var, 2));
                u0Var.d = null;
                return;
            default:
                u0 u0Var2 = this.f57309b;
                u0Var2.f57358c.q(u0Var2.f57366y);
                return;
        }
    }
}
