package pg;
public final class z implements Runnable {
    public final int f41351a;
    public final e0 f41352b;

    public z(e0 e0Var, int i10) {
        this.f41351a = i10;
        this.f41352b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f41351a) {
            case 0:
                e0 e0Var = this.f41352b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f41126a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41352b.a(null, true, null);
                return;
        }
    }
}
