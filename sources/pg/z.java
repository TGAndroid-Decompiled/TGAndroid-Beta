package pg;
public final class z implements Runnable {
    public final int f44697a;
    public final e0 f44698b;

    public z(e0 e0Var, int i10) {
        this.f44697a = i10;
        this.f44698b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44697a) {
            case 0:
                e0 e0Var = this.f44698b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44452a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44698b.a(null, true, null);
                return;
        }
    }
}
