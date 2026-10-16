package qg;
public final class z implements Runnable {
    public final int f43365a;
    public final d0 f43366b;

    public z(d0 d0Var, int i10) {
        this.f43365a = i10;
        this.f43366b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f43365a) {
            case 0:
                d0 d0Var = this.f43366b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f43149a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f43366b.a(null, true, null);
                return;
        }
    }
}
