package pg;
public final class z implements Runnable {
    public final int f45741a;
    public final d0 f45742b;

    public z(d0 d0Var, int i10) {
        this.f45741a = i10;
        this.f45742b = d0Var;
    }

    @Override
    public final void run() {
        switch (this.f45741a) {
            case 0:
                d0 d0Var = this.f45742b;
                m mVar = d0Var.A;
                if (mVar != null) {
                    d0Var.f45497a.g(mVar);
                    d0Var.A = null;
                    return;
                }
                return;
            default:
                this.f45742b.a(null, true, null);
                return;
        }
    }
}
