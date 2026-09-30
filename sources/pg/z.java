package pg;
public final class z implements Runnable {
    public final int f41326a;
    public final e0 f41327b;

    public z(e0 e0Var, int i10) {
        this.f41326a = i10;
        this.f41327b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f41326a) {
            case 0:
                e0 e0Var = this.f41327b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f41101a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41327b.a(null, true, null);
                return;
        }
    }
}
