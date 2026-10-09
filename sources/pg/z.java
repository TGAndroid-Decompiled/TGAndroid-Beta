package pg;
public final class z implements Runnable {
    public final int f45855a;
    public final d0 f45856b;

    public z(d0 d0Var, int i10) {
        this.f45855a = i10;
        this.f45856b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f45855a) {
            case 0:
                d0 d0Var = this.f45856b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f45609a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f45856b.a(null, true, null);
                return;
        }
    }
}
