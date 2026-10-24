package qg;
public final class y0 implements Runnable {
    public final int f45131a;
    public final e1 f45132b;

    public y0(e1 e1Var, int i10) {
        this.f45131a = i10;
        this.f45132b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f45131a) {
            case 0:
                d1 d1Var = this.f45132b.f44933a;
                if (d1Var != null) {
                    d1Var.b();
                    return;
                }
                return;
            case 1:
                e1 e1Var = this.f45132b;
                e1Var.f44935c.a(e1Var.f44938r);
                c1 c1Var = e1Var.d;
                c1Var.getClass();
                c1Var.postRunnable(new b1(c1Var, 2));
                e1Var.d = null;
                return;
            default:
                e1 e1Var2 = this.f45132b;
                e1Var2.f44935c.q(e1Var2.f44941x);
                return;
        }
    }
}
