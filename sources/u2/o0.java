package u2;
public final class o0 implements Runnable {
    public final int f48893a;
    public final t0 f48894b;

    public o0(t0 t0Var, int i10) {
        this.f48893a = i10;
        this.f48894b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f48893a) {
            case 0:
                this.f48894b.Z = true;
                return;
            case 1:
                this.f48894b.t();
                return;
            default:
                t0 t0Var = this.f48894b;
                if (!t0Var.f48937f0) {
                    c0 c0Var = t0Var.I;
                    c0Var.getClass();
                    c0Var.b(t0Var);
                    return;
                }
                return;
        }
    }
}
