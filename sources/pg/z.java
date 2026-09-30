package pg;
public final class z implements Runnable {
    public final int f41423a;
    public final e0 f41424b;

    public z(e0 e0Var, int i10) {
        this.f41423a = i10;
        this.f41424b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f41423a) {
            case 0:
                e0 e0Var = this.f41424b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f41198a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41424b.a(null, true, null);
                return;
        }
    }
}
