package qg;
public final class y0 implements Runnable {
    public final int f44711a;
    public final e1 f44712b;

    public y0(e1 e1Var, int i10) {
        this.f44711a = i10;
        this.f44712b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f44711a) {
            case 0:
                d1 d1Var = this.f44712b.f44511a;
                if (d1Var != null) {
                    d1Var.b();
                    return;
                }
                return;
            case 1:
                e1 e1Var = this.f44712b;
                e1Var.f44513c.a(e1Var.f44516r);
                c1 c1Var = e1Var.d;
                c1Var.getClass();
                c1Var.postRunnable(new b1(c1Var, 2));
                e1Var.d = null;
                return;
            default:
                e1 e1Var2 = this.f44712b;
                e1Var2.f44513c.q(e1Var2.f44519x);
                return;
        }
    }
}
