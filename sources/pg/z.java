package pg;
public final class z implements Runnable {
    public final int f41324a;
    public final e0 f41325b;

    public z(e0 e0Var, int i10) {
        this.f41324a = i10;
        this.f41325b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f41324a) {
            case 0:
                e0 e0Var = this.f41325b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f41099a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41325b.a(null, true, null);
                return;
        }
    }
}
