package u2;
public final class p0 implements Runnable {
    public final int f43750a;
    public final u0 f43751b;

    public p0(u0 u0Var, int i10) {
        this.f43750a = i10;
        this.f43751b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f43750a) {
            case 0:
                this.f43751b.Z = true;
                return;
            case 1:
                this.f43751b.w();
                return;
            default:
                u0 u0Var = this.f43751b;
                if (!u0Var.f43787f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.m(u0Var);
                    return;
                }
                return;
        }
    }
}
