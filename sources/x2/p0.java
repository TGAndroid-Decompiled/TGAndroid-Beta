package x2;
public final class p0 implements Runnable {
    public final int f60205a;
    public final w0 f60206b;

    public p0(w0 w0Var, int i7) {
        this.f60205a = i7;
        this.f60206b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f60205a) {
            case 0:
                this.f60206b.f60268c0 = true;
                return;
            case 1:
                this.f60206b.x();
                return;
            default:
                w0 w0Var = this.f60206b;
                if (!w0Var.f60276i0) {
                    d0 d0Var = w0Var.J;
                    d0Var.getClass();
                    d0Var.c0(w0Var);
                    return;
                }
                return;
        }
    }
}
