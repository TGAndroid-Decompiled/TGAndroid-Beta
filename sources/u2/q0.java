package u2;
public final class q0 implements Runnable {
    public final int f47389a;
    public final v0 f47390b;

    public q0(v0 v0Var, int i10) {
        this.f47389a = i10;
        this.f47390b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f47389a) {
            case 0:
                this.f47390b.Z = true;
                return;
            case 1:
                this.f47390b.t();
                return;
            default:
                v0 v0Var = this.f47390b;
                if (!v0Var.f47430f0) {
                    c0 c0Var = v0Var.I;
                    c0Var.getClass();
                    c0Var.f(v0Var);
                    return;
                }
                return;
        }
    }
}
