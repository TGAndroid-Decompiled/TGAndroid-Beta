package pg;
public final class z implements Runnable {
    public final int f45736a;
    public final d0 f45737b;

    public z(d0 d0Var, int i10) {
        this.f45736a = i10;
        this.f45737b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f45736a) {
            case 0:
                d0 d0Var = this.f45737b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f45492a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f45737b.a(null, true, null);
                return;
        }
    }
}
