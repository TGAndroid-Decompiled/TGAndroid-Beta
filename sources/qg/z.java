package qg;
public final class z implements Runnable {
    public final int f44632a;
    public final d0 f44633b;

    public z(d0 d0Var, int i10) {
        this.f44632a = i10;
        this.f44633b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f44632a) {
            case 0:
                d0 d0Var = this.f44633b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f44398a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44633b.a(null, true, null);
                return;
        }
    }
}
