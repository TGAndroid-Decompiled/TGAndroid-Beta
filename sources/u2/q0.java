package u2;
public final class q0 implements Runnable {
    public final int f43768a;
    public final v0 f43769b;

    public q0(v0 v0Var, int i10) {
        this.f43768a = i10;
        this.f43769b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f43768a) {
            case 0:
                this.f43769b.Z = true;
                return;
            case 1:
                this.f43769b.w();
                return;
            default:
                v0 v0Var = this.f43769b;
                if (!v0Var.f43805f0) {
                    c0 c0Var = v0Var.I;
                    c0Var.getClass();
                    c0Var.m(v0Var);
                    return;
                }
                return;
        }
    }
}
