package pg;
public final class z implements Runnable {
    public final int f45889a;
    public final d0 f45890b;

    public z(d0 d0Var, int i10) {
        this.f45889a = i10;
        this.f45890b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f45889a) {
            case 0:
                d0 d0Var = this.f45890b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f45643a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f45890b.a(null, true, null);
                return;
        }
    }
}
