package pg;
public final class z implements Runnable {
    public final int f41373a;
    public final e0 f41374b;

    public z(e0 e0Var, int i10) {
        this.f41373a = i10;
        this.f41374b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f41373a) {
            case 0:
                e0 e0Var = this.f41374b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f41148a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41374b.a(null, true, null);
                return;
        }
    }
}
