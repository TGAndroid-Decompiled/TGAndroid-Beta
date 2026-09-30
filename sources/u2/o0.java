package u2;
public final class o0 implements Runnable {
    public final int f43846a;
    public final u0 f43847b;

    public o0(u0 u0Var, int i10) {
        this.f43846a = i10;
        this.f43847b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f43846a) {
            case 0:
                this.f43847b.Z = true;
                return;
            case 1:
                this.f43847b.w();
                return;
            default:
                u0 u0Var = this.f43847b;
                if (!u0Var.f43893f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.m(u0Var);
                    return;
                }
                return;
        }
    }
}
