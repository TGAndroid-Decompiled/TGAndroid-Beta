package pg;
public final class z implements Runnable {
    public final int f44704a;
    public final e0 f44705b;

    public z(e0 e0Var, int i10) {
        this.f44704a = i10;
        this.f44705b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44704a) {
            case 0:
                e0 e0Var = this.f44705b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44459a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44705b.a(null, true, null);
                return;
        }
    }
}
