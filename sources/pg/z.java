package pg;
public final class z implements Runnable {
    public final int f44711a;
    public final e0 f44712b;

    public z(e0 e0Var, int i10) {
        this.f44711a = i10;
        this.f44712b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44711a) {
            case 0:
                e0 e0Var = this.f44712b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44466a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44712b.a(null, true, null);
                return;
        }
    }
}
