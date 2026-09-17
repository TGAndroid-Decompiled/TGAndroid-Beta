package pg;
public final class z implements Runnable {
    public final int f41072a;
    public final d0 f41073b;

    public z(d0 d0Var, int i10) {
        this.f41072a = i10;
        this.f41073b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f41072a) {
            case 0:
                d0 d0Var = this.f41073b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f40856a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41073b.a(null, true, null);
                return;
        }
    }
}
