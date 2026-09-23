package pg;
public final class z implements Runnable {
    public final int f41002a;
    public final d0 f41003b;

    public z(d0 d0Var, int i10) {
        this.f41002a = i10;
        this.f41003b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f41002a) {
            case 0:
                d0 d0Var = this.f41003b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f40777a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41003b.a(null, true, null);
                return;
        }
    }
}
