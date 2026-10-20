package qg;
public final class z0 implements Runnable {
    public final int f44723a;
    public final f1 f44724b;

    public z0(f1 f1Var, int i10) {
        this.f44723a = i10;
        this.f44724b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f44723a) {
            case 0:
                e1 e1Var = this.f44724b.f44520a;
                if (e1Var != null) {
                    e1Var.b();
                    return;
                }
                return;
            case 1:
                f1 f1Var = this.f44724b;
                f1Var.f44522c.a(f1Var.f44525r);
                d1 d1Var = f1Var.d;
                d1Var.getClass();
                d1Var.postRunnable(new c1(d1Var, 2));
                f1Var.d = null;
                return;
            default:
                f1 f1Var2 = this.f44724b;
                f1Var2.f44522c.q(f1Var2.f44528x);
                return;
        }
    }
}
