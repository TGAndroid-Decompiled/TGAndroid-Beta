package sg;
public final class p0 implements Runnable {
    public final int f55178a;
    public final w0 f55179b;

    public p0(w0 w0Var, int i7) {
        this.f55178a = i7;
        this.f55179b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f55178a) {
            case 0:
                v0 v0Var = this.f55179b.f55248a;
                if (v0Var != null) {
                    v0Var.o();
                    return;
                }
                return;
            case 1:
                w0 w0Var = this.f55179b;
                w0Var.f55250c.a(w0Var.f55254r);
                u0 u0Var = w0Var.d;
                u0Var.getClass();
                u0Var.postRunnable(new s0(u0Var, 2));
                w0Var.d = null;
                return;
            default:
                w0 w0Var2 = this.f55179b;
                w0Var2.f55250c.q(w0Var2.f55258y);
                return;
        }
    }
}
