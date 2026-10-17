package qg;
public final class a0 implements Runnable {
    public final int f44487a;
    public final e0 f44488b;

    public a0(e0 e0Var, int i10) {
        this.f44487a = i10;
        this.f44488b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44487a) {
            case 0:
                e0 e0Var = this.f44488b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44513a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44488b.a(null, true, null);
                return;
        }
    }
}
