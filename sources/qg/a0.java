package qg;
public final class a0 implements Runnable {
    public final int f44461a;
    public final e0 f44462b;

    public a0(e0 e0Var, int i10) {
        this.f44461a = i10;
        this.f44462b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44461a) {
            case 0:
                e0 e0Var = this.f44462b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44489a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44462b.a(null, true, null);
                return;
        }
    }
}
