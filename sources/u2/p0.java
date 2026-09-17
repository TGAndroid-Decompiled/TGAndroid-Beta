package u2;
public final class p0 implements Runnable {
    public final int f46812a;
    public final u0 f46813b;

    public p0(u0 u0Var, int i10) {
        this.f46812a = i10;
        this.f46813b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f46812a) {
            case 0:
                this.f46813b.Z = true;
                return;
            case 1:
                this.f46813b.x();
                return;
            default:
                u0 u0Var = this.f46813b;
                if (!u0Var.f46850f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.b(u0Var);
                    return;
                }
                return;
        }
    }
}
