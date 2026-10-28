package u2;
public final class p0 implements Runnable {
    public final int f49434a;
    public final w0 f49435b;

    public p0(w0 w0Var, int i10) {
        this.f49434a = i10;
        this.f49435b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f49434a) {
            case 0:
                this.f49435b.f49488b0 = true;
                return;
            case 1:
                this.f49435b.t();
                return;
            default:
                w0 w0Var = this.f49435b;
                if (!w0Var.f49496h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.u(w0Var);
                    return;
                }
                return;
        }
    }
}
