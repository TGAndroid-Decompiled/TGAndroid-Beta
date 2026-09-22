package u2;
public final class p0 implements Runnable {
    public final int f43462a;
    public final u0 f43463b;

    public p0(u0 u0Var, int i10) {
        this.f43462a = i10;
        this.f43463b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f43462a) {
            case 0:
                this.f43463b.Z = true;
                return;
            case 1:
                this.f43463b.w();
                return;
            default:
                u0 u0Var = this.f43463b;
                if (!u0Var.f43496f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.v(u0Var);
                    return;
                }
                return;
        }
    }
}
