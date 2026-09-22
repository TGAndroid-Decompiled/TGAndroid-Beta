package pg;
public final class z implements Runnable {
    public final int f41046a;
    public final d0 f41047b;

    public z(d0 d0Var, int i10) {
        this.f41046a = i10;
        this.f41047b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f41046a) {
            case 0:
                d0 d0Var = this.f41047b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f40830a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41047b.a(null, true, null);
                return;
        }
    }
}
