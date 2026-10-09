package pg;
public final class z implements Runnable {
    public final int f45853a;
    public final d0 f45854b;

    public z(d0 d0Var, int i10) {
        this.f45853a = i10;
        this.f45854b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f45853a) {
            case 0:
                d0 d0Var = this.f45854b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f45607a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f45854b.a(null, true, null);
                return;
        }
    }
}
