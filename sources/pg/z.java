package pg;
public final class z implements Runnable {
    public final int f41325a;
    public final e0 f41326b;

    public z(e0 e0Var, int i10) {
        this.f41325a = i10;
        this.f41326b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f41325a) {
            case 0:
                e0 e0Var = this.f41326b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f41100a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41326b.a(null, true, null);
                return;
        }
    }
}
