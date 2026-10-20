package qg;
public final class a0 implements Runnable {
    public final int f44469a;
    public final e0 f44470b;

    public a0(e0 e0Var, int i10) {
        this.f44469a = i10;
        this.f44470b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f44469a) {
            case 0:
                e0 e0Var = this.f44470b;
                m mVar = e0Var.A;
                if (mVar != null) {
                    e0Var.f44497a.g(mVar);
                    e0Var.A = null;
                    return;
                }
                return;
            default:
                this.f44470b.a(null, true, null);
                return;
        }
    }
}
