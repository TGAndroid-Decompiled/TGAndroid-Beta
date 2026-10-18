package qg;
public final class a0 implements Runnable {
    public final int f44507a;
    public final e0 f44508b;

    public a0(e0 e0Var, int i10) {
        this.f44507a = i10;
        this.f44508b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44507a) {
            case 0:
                e0 e0Var = this.f44508b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44533a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44508b.a(null, true, null);
                return;
        }
    }
}
