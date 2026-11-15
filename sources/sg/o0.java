package sg;
public final class o0 implements Runnable {
    public final int f56734a;
    public final u0 f56735b;

    public o0(u0 u0Var, int i7) {
        this.f56734a = i7;
        this.f56735b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f56734a) {
            case 0:
                t0 t0Var = this.f56735b.f56782a;
                if (t0Var != null) {
                    t0Var.o();
                    return;
                }
                return;
            case 1:
                u0 u0Var = this.f56735b;
                u0Var.f56784c.a(u0Var.f56788r);
                s0 s0Var = u0Var.d;
                s0Var.getClass();
                s0Var.postRunnable(new r0(s0Var, 2));
                u0Var.d = null;
                return;
            default:
                u0 u0Var2 = this.f56735b;
                u0Var2.f56784c.q(u0Var2.f56792y);
                return;
        }
    }
}
