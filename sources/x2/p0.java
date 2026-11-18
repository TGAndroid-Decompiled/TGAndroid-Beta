package x2;
public final class p0 implements Runnable {
    public final int f60195a;
    public final w0 f60196b;

    public p0(w0 w0Var, int i7) {
        this.f60195a = i7;
        this.f60196b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f60195a) {
            case 0:
                this.f60196b.f60258c0 = true;
                return;
            case 1:
                this.f60196b.x();
                return;
            default:
                w0 w0Var = this.f60196b;
                if (!w0Var.f60266i0) {
                    d0 d0Var = w0Var.J;
                    d0Var.getClass();
                    d0Var.c0(w0Var);
                    return;
                }
                return;
        }
    }
}
