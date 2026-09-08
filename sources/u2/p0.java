package u2;
public final class p0 implements Runnable {
    public final int f46811a;
    public final u0 f46812b;

    public p0(u0 u0Var, int i10) {
        this.f46811a = i10;
        this.f46812b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f46811a) {
            case 0:
                this.f46812b.Z = true;
                return;
            case 1:
                this.f46812b.x();
                return;
            default:
                u0 u0Var = this.f46812b;
                if (!u0Var.f46849f0) {
                    c0 c0Var = u0Var.I;
                    c0Var.getClass();
                    c0Var.b(u0Var);
                    return;
                }
                return;
        }
    }
}
