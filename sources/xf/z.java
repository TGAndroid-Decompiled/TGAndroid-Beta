package xf;
public final class z implements Runnable {
    public final int f49424a;
    public final d0 f49425b;

    public z(d0 d0Var, int i9) {
        this.f49424a = i9;
        this.f49425b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f49424a) {
            case 0:
                d0 d0Var = this.f49425b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f49189a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f49425b.a(null, true, null);
                return;
        }
    }
}
