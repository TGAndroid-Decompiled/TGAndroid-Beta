package x2;
public final class p0 implements Runnable {
    public final int f58342a;
    public final w0 f58343b;

    public p0(w0 w0Var, int i7) {
        this.f58342a = i7;
        this.f58343b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f58342a) {
            case 0:
                this.f58343b.f58400b0 = true;
                return;
            case 1:
                this.f58343b.u();
                return;
            default:
                w0 w0Var = this.f58343b;
                if (!w0Var.f58409h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.d(w0Var);
                    return;
                }
                return;
        }
    }
}
