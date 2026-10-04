package u2;
public final class q0 implements Runnable {
    public final int f47373a;
    public final v0 f47374b;

    public q0(v0 v0Var, int i10) {
        this.f47373a = i10;
        this.f47374b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f47373a) {
            case 0:
                this.f47374b.Z = true;
                return;
            case 1:
                this.f47374b.w();
                return;
            default:
                v0 v0Var = this.f47374b;
                if (!v0Var.f47414f0) {
                    c0 c0Var = v0Var.I;
                    c0Var.getClass();
                    c0Var.f(v0Var);
                    return;
                }
                return;
        }
    }
}
