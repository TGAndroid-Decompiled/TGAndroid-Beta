package qg;
public final class y0 implements Runnable {
    public final int f44753a;
    public final e1 f44754b;

    public y0(e1 e1Var, int i10) {
        this.f44753a = i10;
        this.f44754b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f44753a) {
            case 0:
                d1 d1Var = this.f44754b.f44555a;
                if (d1Var != null) {
                    d1Var.b();
                    return;
                }
                return;
            case 1:
                e1 e1Var = this.f44754b;
                e1Var.f44557c.a(e1Var.f44560r);
                c1 c1Var = e1Var.d;
                c1Var.getClass();
                c1Var.postRunnable(new b1(c1Var, 2));
                e1Var.d = null;
                return;
            default:
                e1 e1Var2 = this.f44754b;
                e1Var2.f44557c.q(e1Var2.f44563x);
                return;
        }
    }
}
