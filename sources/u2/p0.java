package u2;
public final class p0 implements Runnable {
    public final int f47424a;
    public final w0 f47425b;

    public p0(w0 w0Var, int i10) {
        this.f47424a = i10;
        this.f47425b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f47424a) {
            case 0:
                this.f47425b.f47478b0 = true;
                return;
            case 1:
                this.f47425b.w();
                return;
            default:
                w0 w0Var = this.f47425b;
                if (!w0Var.f47486h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.v(w0Var);
                    return;
                }
                return;
        }
    }
}
