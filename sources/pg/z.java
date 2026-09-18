package pg;
public final class z implements Runnable {
    public final int f41077a;
    public final d0 f41078b;

    public z(d0 d0Var, int i10) {
        this.f41077a = i10;
        this.f41078b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f41077a) {
            case 0:
                d0 d0Var = this.f41078b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f40861a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41078b.a(null, true, null);
                return;
        }
    }
}
