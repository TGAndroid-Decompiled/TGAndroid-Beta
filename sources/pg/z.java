package pg;
public final class z implements Runnable {
    public final int f45899a;
    public final d0 f45900b;

    public z(d0 d0Var, int i10) {
        this.f45899a = i10;
        this.f45900b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f45899a) {
            case 0:
                d0 d0Var = this.f45900b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f45653a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f45900b.a(null, true, null);
                return;
        }
    }
}
