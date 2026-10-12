package qg;
public final class z implements Runnable {
    public final int f43623a;
    public final d0 f43624b;

    public z(d0 d0Var, int i10) {
        this.f43623a = i10;
        this.f43624b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f43623a) {
            case 0:
                d0 d0Var = this.f43624b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f43407a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f43624b.a(null, true, null);
                return;
        }
    }
}
