package u2;
public final class r0 implements Runnable {
    public final int f42439a;
    public final w0 f42440b;

    public r0(w0 w0Var, int i10) {
        this.f42439a = i10;
        this.f42440b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f42439a) {
            case 0:
                this.f42440b.Z = true;
                return;
            case 1:
                this.f42440b.w();
                return;
            default:
                w0 w0Var = this.f42440b;
                if (!w0Var.f42476f0) {
                    d0 d0Var = w0Var.I;
                    d0Var.getClass();
                    d0Var.g(w0Var);
                    return;
                }
                return;
        }
    }
}
