package qg;
public final class z implements Runnable {
    public final int f44661a;
    public final d0 f44662b;

    public z(d0 d0Var, int i10) {
        this.f44661a = i10;
        this.f44662b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f44661a) {
            case 0:
                d0 d0Var = this.f44662b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f44427a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44662b.a(null, true, null);
                return;
        }
    }
}
