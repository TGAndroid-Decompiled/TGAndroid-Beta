package u2;
public final class p0 implements Runnable {
    public final int f47401a;
    public final w0 f47402b;

    public p0(w0 w0Var, int i10) {
        this.f47401a = i10;
        this.f47402b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f47401a) {
            case 0:
                this.f47402b.f47455b0 = true;
                return;
            case 1:
                this.f47402b.w();
                return;
            default:
                w0 w0Var = this.f47402b;
                if (!w0Var.f47463h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.h(w0Var);
                    return;
                }
                return;
        }
    }
}
