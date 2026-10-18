package qg;
public final class z implements Runnable {
    public final int f44713a;
    public final d0 f44714b;

    public z(d0 d0Var, int i10) {
        this.f44713a = i10;
        this.f44714b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f44713a) {
            case 0:
                d0 d0Var = this.f44714b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f44488a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44714b.a(null, true, null);
                return;
        }
    }
}
