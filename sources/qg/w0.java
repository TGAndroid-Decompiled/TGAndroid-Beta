package qg;
public final class w0 implements Runnable {
    public final int f43348a;
    public final c1 f43349b;

    public w0(c1 c1Var, int i10) {
        this.f43348a = i10;
        this.f43349b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f43348a) {
            case 0:
                b1 b1Var = this.f43349b.f43139a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f43349b;
                c1Var.f43141c.a(c1Var.f43144r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f43349b;
                c1Var2.f43141c.q(c1Var2.f43147x);
                return;
        }
    }
}
