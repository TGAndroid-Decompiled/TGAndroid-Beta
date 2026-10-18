package u2;
public final class p0 implements Runnable {
    public final int f47400a;
    public final x0 f47401b;

    public p0(x0 x0Var, int i10) {
        this.f47400a = i10;
        this.f47401b = x0Var;
    }

    @Override
    public final void run() {
        switch (this.f47400a) {
            case 0:
                this.f47401b.f47462b0 = true;
                return;
            case 1:
                this.f47401b.w();
                return;
            default:
                x0 x0Var = this.f47401b;
                if (!x0Var.f47470h0) {
                    d0 d0Var = x0Var.I;
                    d0Var.getClass();
                    d0Var.v(x0Var);
                    return;
                }
                return;
        }
    }
}
