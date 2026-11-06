package sg;
public final class p0 implements Runnable {
    public final int f55086a;
    public final w0 f55087b;

    public p0(w0 w0Var, int i7) {
        this.f55086a = i7;
        this.f55087b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f55086a) {
            case 0:
                v0 v0Var = this.f55087b.f55156a;
                if (v0Var != null) {
                    v0Var.o();
                    return;
                }
                return;
            case 1:
                w0 w0Var = this.f55087b;
                w0Var.f55158c.a(w0Var.f55162r);
                u0 u0Var = w0Var.d;
                u0Var.getClass();
                u0Var.postRunnable(new s0(u0Var, 2));
                w0Var.d = null;
                return;
            default:
                w0 w0Var2 = this.f55087b;
                w0Var2.f55158c.q(w0Var2.f55166y);
                return;
        }
    }
}
