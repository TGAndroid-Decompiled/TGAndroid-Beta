package u2;
public final class o0 implements Runnable {
    public final int f48744a;
    public final t0 f48745b;

    public o0(t0 t0Var, int i10) {
        this.f48744a = i10;
        this.f48745b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f48744a) {
            case 0:
                this.f48745b.Z = true;
                return;
            case 1:
                this.f48745b.t();
                return;
            default:
                t0 t0Var = this.f48745b;
                if (!t0Var.f48788f0) {
                    c0 c0Var = t0Var.I;
                    c0Var.getClass();
                    c0Var.D(t0Var);
                    return;
                }
                return;
        }
    }
}
