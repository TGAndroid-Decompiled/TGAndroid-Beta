package pg;
public final class z implements Runnable {
    public final int f44696a;
    public final e0 f44697b;

    public z(e0 e0Var, int i10) {
        this.f44696a = i10;
        this.f44697b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44696a) {
            case 0:
                e0 e0Var = this.f44697b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44451a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44697b.a(null, true, null);
                return;
        }
    }
}
