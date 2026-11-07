package x2;
public final class p0 implements Runnable {
    public final int f58347a;
    public final w0 f58348b;

    public p0(w0 w0Var, int i7) {
        this.f58347a = i7;
        this.f58348b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f58347a) {
            case 0:
                this.f58348b.f58405b0 = true;
                return;
            case 1:
                this.f58348b.u();
                return;
            default:
                w0 w0Var = this.f58348b;
                if (!w0Var.f58414h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.d(w0Var);
                    return;
                }
                return;
        }
    }
}
