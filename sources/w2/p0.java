package w2;
public final class p0 implements Runnable {
    public final int f57188a;
    public final w0 f57189b;

    public p0(w0 w0Var, int i3) {
        this.f57188a = i3;
        this.f57189b = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f57188a) {
            case 0:
                this.f57189b.f57251c0 = true;
                return;
            case 1:
                this.f57189b.w();
                return;
            default:
                w0 w0Var = this.f57189b;
                if (!w0Var.f57259i0) {
                    d0 d0Var = w0Var.J;
                    d0Var.getClass();
                    d0Var.k(w0Var);
                    return;
                }
                return;
        }
    }
}
