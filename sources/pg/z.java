package pg;
public final class z implements Runnable {
    public final int f41310a;
    public final e0 f41311b;

    public z(e0 e0Var, int i10) {
        this.f41310a = i10;
        this.f41311b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f41310a) {
            case 0:
                e0 e0Var = this.f41311b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f41085a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f41311b.a(null, true, null);
                return;
        }
    }
}
