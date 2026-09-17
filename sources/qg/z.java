package qg;
public final class z implements Runnable {
    public final int f44633a;
    public final d0 f44634b;

    public z(d0 d0Var, int i10) {
        this.f44633a = i10;
        this.f44634b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f44633a) {
            case 0:
                d0 d0Var = this.f44634b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f44399a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44634b.a(null, true, null);
                return;
        }
    }
}
