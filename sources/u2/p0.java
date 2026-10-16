package u2;
public final class p0 implements Runnable {
    public final int f46017a;
    public final w0 f46018b;

    public p0(w0 w0Var, int i10) {
        this.f46017a = i10;
        this.f46018b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f46017a) {
            case 0:
                this.f46018b.f46071b0 = true;
                return;
            case 1:
                this.f46018b.t();
                return;
            default:
                w0 w0Var = this.f46018b;
                if (!w0Var.f46079h0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.F(w0Var);
                    return;
                }
                return;
        }
    }
}
