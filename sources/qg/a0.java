package qg;
public final class a0 implements Runnable {
    public final int f44885a;
    public final e0 f44886b;

    public a0(e0 e0Var, int i10) {
        this.f44885a = i10;
        this.f44886b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44885a) {
            case 0:
                e0 e0Var = this.f44886b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44911a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44886b.a(null, true, null);
                return;
        }
    }
}
