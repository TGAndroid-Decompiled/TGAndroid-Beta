package pg;
public final class z implements Runnable {
    public final int f41322a;
    public final e0 f41323b;

    public z(e0 e0Var, int i10) {
        this.f41322a = i10;
        this.f41323b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f41322a) {
            case 0:
                e0 e0Var = this.f41323b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f41097a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41323b.a(null, true, null);
                return;
        }
    }
}
