package u2;
public final class p0 implements Runnable {
    public final int f43734a;
    public final u0 f43735b;

    public p0(u0 u0Var, int i10) {
        this.f43734a = i10;
        this.f43735b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f43734a) {
            case 0:
                this.f43735b.Z = true;
                return;
            case 1:
                this.f43735b.w();
                return;
            default:
                u0 u0Var = this.f43735b;
                if (!u0Var.f43771f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.m(u0Var);
                    return;
                }
                return;
        }
    }
}
