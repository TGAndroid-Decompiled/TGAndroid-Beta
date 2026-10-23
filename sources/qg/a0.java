package qg;
public final class a0 implements Runnable {
    public final int f44473a;
    public final e0 f44474b;

    public a0(e0 e0Var, int i10) {
        this.f44473a = i10;
        this.f44474b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44473a) {
            case 0:
                e0 e0Var = this.f44474b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44501a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44474b.a(null, true, null);
                return;
        }
    }
}
