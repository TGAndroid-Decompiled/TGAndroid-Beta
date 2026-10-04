package u2;
public final class q0 implements Runnable {
    public final int f47374a;
    public final v0 f47375b;

    public q0(v0 v0Var, int i10) {
        this.f47374a = i10;
        this.f47375b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f47374a) {
            case 0:
                this.f47375b.Z = true;
                return;
            case 1:
                this.f47375b.w();
                return;
            default:
                v0 v0Var = this.f47375b;
                if (!v0Var.f47415f0) {
                    c0 c0Var = v0Var.I;
                    c0Var.getClass();
                    c0Var.f(v0Var);
                    return;
                }
                return;
        }
    }
}
