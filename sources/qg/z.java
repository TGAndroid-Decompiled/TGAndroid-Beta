package qg;
public final class z implements Runnable {
    public final int f44660a;
    public final d0 f44661b;

    public z(d0 d0Var, int i10) {
        this.f44660a = i10;
        this.f44661b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f44660a) {
            case 0:
                d0 d0Var = this.f44661b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f44426a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44661b.a(null, true, null);
                return;
        }
    }
}
