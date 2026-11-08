package x2;
public final class p0 implements Runnable {
    public final int f58436a;
    public final w0 f58437b;

    public p0(w0 w0Var, int i7) {
        this.f58436a = i7;
        this.f58437b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f58436a) {
            case 0:
                this.f58437b.f58494b0 = true;
                return;
            case 1:
                this.f58437b.u();
                return;
            default:
                w0 w0Var = this.f58437b;
                if (!w0Var.f58503h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.d(w0Var);
                    return;
                }
                return;
        }
    }
}
