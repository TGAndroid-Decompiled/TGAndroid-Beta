package qg;
public final class w0 implements Runnable {
    public final int f43606a;
    public final c1 f43607b;

    public w0(c1 c1Var, int i10) {
        this.f43606a = i10;
        this.f43607b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f43606a) {
            case 0:
                b1 b1Var = this.f43607b.f43397a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f43607b;
                c1Var.f43399c.a(c1Var.f43402r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f43607b;
                c1Var2.f43399c.q(c1Var2.f43405x);
                return;
        }
    }
}
