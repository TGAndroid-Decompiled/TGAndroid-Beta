package u2;
public final class o0 implements Runnable {
    public final int f48717a;
    public final u0 f48718b;

    public o0(u0 u0Var, int i10) {
        this.f48717a = i10;
        this.f48718b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f48717a) {
            case 0:
                this.f48718b.Z = true;
                return;
            case 1:
                this.f48718b.t();
                return;
            default:
                u0 u0Var = this.f48718b;
                if (!u0Var.f48769f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.D(u0Var);
                    return;
                }
                return;
        }
    }
}
