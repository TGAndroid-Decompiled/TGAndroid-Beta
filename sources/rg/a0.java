package rg;
public final class a0 implements Runnable {
    public final int f47357a;
    public final e0 f47358b;

    public a0(e0 e0Var, int i10) {
        this.f47357a = i10;
        this.f47358b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f47357a) {
            case 0:
                e0 e0Var = this.f47358b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f47391a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f47358b.a(null, true, null);
                return;
        }
    }
}
