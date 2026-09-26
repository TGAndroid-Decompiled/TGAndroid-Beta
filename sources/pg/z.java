package pg;
public final class z implements Runnable {
    public final int f41323a;
    public final e0 f41324b;

    public z(e0 e0Var, int i10) {
        this.f41323a = i10;
        this.f41324b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f41323a) {
            case 0:
                e0 e0Var = this.f41324b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f41098a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41324b.a(null, true, null);
                return;
        }
    }
}
