package qg;
public final class w0 implements Runnable {
    public final int f44613a;
    public final c1 f44614b;

    public w0(c1 c1Var, int i10) {
        this.f44613a = i10;
        this.f44614b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f44613a) {
            case 0:
                b1 b1Var = this.f44614b.f44387a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f44614b;
                c1Var.f44389c.a(c1Var.f44393r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f44614b;
                c1Var2.f44389c.q(c1Var2.f44396x);
                return;
        }
    }
}
