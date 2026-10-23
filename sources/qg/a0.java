package qg;
public final class a0 implements Runnable {
    public final int f44886a;
    public final e0 f44887b;

    public a0(e0 e0Var, int i10) {
        this.f44886a = i10;
        this.f44887b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44886a) {
            case 0:
                e0 e0Var = this.f44887b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44912a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44887b.a(null, true, null);
                return;
        }
    }
}
