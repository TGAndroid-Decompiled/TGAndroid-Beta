package qg;
public final class y0 implements Runnable {
    public final int f45132a;
    public final e1 f45133b;

    public y0(e1 e1Var, int i10) {
        this.f45132a = i10;
        this.f45133b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f45132a) {
            case 0:
                d1 d1Var = this.f45133b.f44934a;
                if (d1Var != null) {
                    d1Var.b();
                    return;
                }
                return;
            case 1:
                e1 e1Var = this.f45133b;
                e1Var.f44936c.a(e1Var.f44939r);
                c1 c1Var = e1Var.d;
                c1Var.getClass();
                c1Var.postRunnable(new b1(c1Var, 2));
                e1Var.d = null;
                return;
            default:
                e1 e1Var2 = this.f45133b;
                e1Var2.f44936c.q(e1Var2.f44942x);
                return;
        }
    }
}
