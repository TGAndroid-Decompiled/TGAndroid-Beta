package rg;
public final class a0 implements Runnable {
    public final int f47354a;
    public final e0 f47355b;

    public a0(e0 e0Var, int i10) {
        this.f47354a = i10;
        this.f47355b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f47354a) {
            case 0:
                e0 e0Var = this.f47355b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f47388a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f47355b.a(null, true, null);
                return;
        }
    }
}
