package x2;
public final class p0 implements Runnable {
    public final int f58446a;
    public final w0 f58447b;

    public p0(w0 w0Var, int i7) {
        this.f58446a = i7;
        this.f58447b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f58446a) {
            case 0:
                this.f58447b.f58504b0 = true;
                return;
            case 1:
                this.f58447b.u();
                return;
            default:
                w0 w0Var = this.f58447b;
                if (!w0Var.f58513h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.d(w0Var);
                    return;
                }
                return;
        }
    }
}
