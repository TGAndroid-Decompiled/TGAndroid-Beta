package tg;
public final class o0 implements Runnable {
    public final int f55276a;
    public final u0 f55277b;

    public o0(u0 u0Var, int i3) {
        this.f55276a = i3;
        this.f55277b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f55276a) {
            case 0:
                t0 t0Var = this.f55277b.f55321a;
                if (t0Var != null) {
                    t0Var.k();
                    return;
                }
                return;
            case 1:
                u0 u0Var = this.f55277b;
                u0Var.f55323c.a(u0Var.f55327r);
                s0 s0Var = u0Var.d;
                s0Var.getClass();
                s0Var.postRunnable(new r0(s0Var, 2));
                u0Var.d = null;
                return;
            default:
                u0 u0Var2 = this.f55277b;
                u0Var2.f55323c.q(u0Var2.f55331y);
                return;
        }
    }
}
