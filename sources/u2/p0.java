package u2;
public final class p0 implements Runnable {
    public final int f49977a;
    public final w0 f49978b;

    public p0(w0 w0Var, int i10) {
        this.f49977a = i10;
        this.f49978b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f49977a) {
            case 0:
                this.f49978b.f50032b0 = true;
                return;
            case 1:
                this.f49978b.w();
                return;
            default:
                w0 w0Var = this.f49978b;
                if (!w0Var.f50040h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.r(w0Var);
                    return;
                }
                return;
        }
    }
}
