package pg;
public final class y0 implements Runnable {
    public final int f41421a;
    public final f1 f41422b;

    public y0(f1 f1Var, int i10) {
        this.f41421a = i10;
        this.f41422b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f41421a) {
            case 0:
                e1 e1Var = this.f41422b.f41222a;
                if (e1Var != null) {
                    e1Var.b();
                    return;
                }
                return;
            case 1:
                f1 f1Var = this.f41422b;
                f1Var.f41224c.a(f1Var.f41227r);
                d1 d1Var = f1Var.d;
                d1Var.getClass();
                d1Var.postRunnable(new b1(d1Var, 2));
                f1Var.d = null;
                return;
            default:
                f1 f1Var2 = this.f41422b;
                f1Var2.f41224c.q(f1Var2.f41230x);
                return;
        }
    }
}
