package u2;
public final class o0 implements Runnable {
    public final int f48885a;
    public final t0 f48886b;

    public o0(t0 t0Var, int i10) {
        this.f48885a = i10;
        this.f48886b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f48885a) {
            case 0:
                this.f48886b.Z = true;
                return;
            case 1:
                this.f48886b.t();
                return;
            default:
                t0 t0Var = this.f48886b;
                if (!t0Var.f48929f0) {
                    c0 c0Var = t0Var.I;
                    c0Var.getClass();
                    c0Var.b(t0Var);
                    return;
                }
                return;
        }
    }
}
