package pg;
public final class y0 implements Runnable {
    public final int f44695a;
    public final f1 f44696b;

    public y0(f1 f1Var, int i10) {
        this.f44695a = i10;
        this.f44696b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f44695a) {
            case 0:
                e1 e1Var = this.f44696b.f44477a;
                if (e1Var != null) {
                    e1Var.b();
                    return;
                }
                return;
            case 1:
                f1 f1Var = this.f44696b;
                f1Var.f44479c.a(f1Var.f44483r);
                d1 d1Var = f1Var.d;
                d1Var.getClass();
                d1Var.postRunnable(new b1(d1Var, 2));
                f1Var.d = null;
                return;
            default:
                f1 f1Var2 = this.f44696b;
                f1Var2.f44479c.q(f1Var2.f44486x);
                return;
        }
    }
}
