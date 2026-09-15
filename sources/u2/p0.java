package u2;
public final class p0 implements Runnable {
    public final int f43466a;
    public final u0 f43467b;

    public p0(u0 u0Var, int i10) {
        this.f43466a = i10;
        this.f43467b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f43466a) {
            case 0:
                this.f43467b.Z = true;
                return;
            case 1:
                this.f43467b.w();
                return;
            default:
                u0 u0Var = this.f43467b;
                if (!u0Var.f43500f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.v(u0Var);
                    return;
                }
                return;
        }
    }
}
