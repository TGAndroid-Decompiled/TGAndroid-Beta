package qg;
public final class a0 implements Runnable {
    public final int f44459a;
    public final e0 f44460b;

    public a0(e0 e0Var, int i10) {
        this.f44459a = i10;
        this.f44460b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44459a) {
            case 0:
                e0 e0Var = this.f44460b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44487a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44460b.a(null, true, null);
                return;
        }
    }
}
