package pg;
public final class z implements Runnable {
    public final int f45923a;
    public final d0 f45924b;

    public z(d0 d0Var, int i10) {
        this.f45923a = i10;
        this.f45924b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f45923a) {
            case 0:
                d0 d0Var = this.f45924b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f45677a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f45924b.a(null, true, null);
                return;
        }
    }
}
