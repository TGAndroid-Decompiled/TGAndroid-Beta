package pg;
public final class y0 implements Runnable {
    public final int f45897a;
    public final e1 f45898b;

    public y0(e1 e1Var, int i10) {
        this.f45897a = i10;
        this.f45898b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f45897a) {
            case 0:
                d1 d1Var = this.f45898b.f45677a;
                if (d1Var != null) {
                    d1Var.b();
                    return;
                }
                return;
            case 1:
                e1 e1Var = this.f45898b;
                e1Var.f45679c.a(e1Var.f45683r);
                c1 c1Var = e1Var.d;
                c1Var.getClass();
                c1Var.postRunnable(new b1(c1Var, 2));
                e1Var.d = null;
                return;
            default:
                e1 e1Var2 = this.f45898b;
                e1Var2.f45679c.q(e1Var2.f45686x);
                return;
        }
    }
}
