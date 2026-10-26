package u2;
public final class p0 implements Runnable {
    public final int f49399a;
    public final w0 f49400b;

    public p0(w0 w0Var, int i10) {
        this.f49399a = i10;
        this.f49400b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f49399a) {
            case 0:
                this.f49400b.f49453b0 = true;
                return;
            case 1:
                this.f49400b.t();
                return;
            default:
                w0 w0Var = this.f49400b;
                if (!w0Var.f49461h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.u(w0Var);
                    return;
                }
                return;
        }
    }
}
