package rg;
public final class a0 implements Runnable {
    public final int f47392a;
    public final e0 f47393b;

    public a0(e0 e0Var, int i10) {
        this.f47392a = i10;
        this.f47393b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f47392a) {
            case 0:
                e0 e0Var = this.f47393b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f47426a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f47393b.a(null, true, null);
                return;
        }
    }
}
