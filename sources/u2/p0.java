package u2;
public final class p0 implements Runnable {
    public final int f47403a;
    public final w0 f47404b;

    public p0(w0 w0Var, int i10) {
        this.f47403a = i10;
        this.f47404b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f47403a) {
            case 0:
                this.f47404b.f47457b0 = true;
                return;
            case 1:
                this.f47404b.w();
                return;
            default:
                w0 w0Var = this.f47404b;
                if (!w0Var.f47465h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.h(w0Var);
                    return;
                }
                return;
        }
    }
}
