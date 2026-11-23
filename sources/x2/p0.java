package x2;
public final class p0 implements Runnable {
    public final int f60240a;
    public final w0 f60241b;

    public p0(w0 w0Var, int i7) {
        this.f60240a = i7;
        this.f60241b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f60240a) {
            case 0:
                this.f60241b.f60303c0 = true;
                return;
            case 1:
                this.f60241b.x();
                return;
            default:
                w0 w0Var = this.f60241b;
                if (!w0Var.f60311i0) {
                    d0 d0Var = w0Var.J;
                    d0Var.getClass();
                    d0Var.c0(w0Var);
                    return;
                }
                return;
        }
    }
}
