package u2;
public final class o0 implements Runnable {
    public final int f43738a;
    public final u0 f43739b;

    public o0(u0 u0Var, int i10) {
        this.f43738a = i10;
        this.f43739b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f43738a) {
            case 0:
                this.f43739b.Z = true;
                return;
            case 1:
                this.f43739b.w();
                return;
            default:
                u0 u0Var = this.f43739b;
                if (!u0Var.f43785f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.m(u0Var);
                    return;
                }
                return;
        }
    }
}
