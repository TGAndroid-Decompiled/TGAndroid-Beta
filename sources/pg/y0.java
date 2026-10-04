package pg;
public final class y0 implements Runnable {
    public final int f44702a;
    public final f1 f44703b;

    public y0(f1 f1Var, int i10) {
        this.f44702a = i10;
        this.f44703b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f44702a) {
            case 0:
                e1 e1Var = this.f44703b.f44484a;
                if (e1Var != null) {
                    e1Var.b();
                    return;
                }
                return;
            case 1:
                f1 f1Var = this.f44703b;
                f1Var.f44486c.a(f1Var.f44490r);
                d1 d1Var = f1Var.d;
                d1Var.getClass();
                d1Var.postRunnable(new b1(d1Var, 2));
                f1Var.d = null;
                return;
            default:
                f1 f1Var2 = this.f44703b;
                f1Var2.f44486c.q(f1Var2.f44493x);
                return;
        }
    }
}
