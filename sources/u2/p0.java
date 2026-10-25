package u2;
public final class p0 implements Runnable {
    public final int f49396a;
    public final w0 f49397b;

    public p0(w0 w0Var, int i10) {
        this.f49396a = i10;
        this.f49397b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f49396a) {
            case 0:
                this.f49397b.f49450b0 = true;
                return;
            case 1:
                this.f49397b.t();
                return;
            default:
                w0 w0Var = this.f49397b;
                if (!w0Var.f49458h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.u(w0Var);
                    return;
                }
                return;
        }
    }
}
