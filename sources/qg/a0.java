package qg;
public final class a0 implements Runnable {
    public final int f44472a;
    public final e0 f44473b;

    public a0(e0 e0Var, int i10) {
        this.f44472a = i10;
        this.f44473b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44472a) {
            case 0:
                e0 e0Var = this.f44473b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44500a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44473b.a(null, true, null);
                return;
        }
    }
}
