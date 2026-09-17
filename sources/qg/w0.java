package qg;
public final class w0 implements Runnable {
    public final int f44614a;
    public final c1 f44615b;

    public w0(c1 c1Var, int i10) {
        this.f44614a = i10;
        this.f44615b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f44614a) {
            case 0:
                b1 b1Var = this.f44615b.f44388a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f44615b;
                c1Var.f44390c.a(c1Var.f44394r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f44615b;
                c1Var2.f44390c.q(c1Var2.f44397x);
                return;
        }
    }
}
