package pg;
public final class z implements Runnable {
    public final int f41050a;
    public final d0 f41051b;

    public z(d0 d0Var, int i10) {
        this.f41050a = i10;
        this.f41051b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f41050a) {
            case 0:
                d0 d0Var = this.f41051b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f40834a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41051b.a(null, true, null);
                return;
        }
    }
}
