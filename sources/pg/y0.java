package pg;
public final class y0 implements Runnable {
    public final int f41371a;
    public final f1 f41372b;

    public y0(f1 f1Var, int i10) {
        this.f41371a = i10;
        this.f41372b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f41371a) {
            case 0:
                e1 e1Var = this.f41372b.f41172a;
                if (e1Var != null) {
                    e1Var.b();
                    return;
                }
                return;
            case 1:
                f1 f1Var = this.f41372b;
                f1Var.f41174c.a(f1Var.f41177r);
                d1 d1Var = f1Var.d;
                d1Var.getClass();
                d1Var.postRunnable(new b1(d1Var, 2));
                f1Var.d = null;
                return;
            default:
                f1 f1Var2 = this.f41372b;
                f1Var2.f41174c.q(f1Var2.f41180x);
                return;
        }
    }
}
