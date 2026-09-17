package qg;
public final class w0 implements Runnable {
    public final int f44642a;
    public final c1 f44643b;

    public w0(c1 c1Var, int i10) {
        this.f44642a = i10;
        this.f44643b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f44642a) {
            case 0:
                b1 b1Var = this.f44643b.f44416a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f44643b;
                c1Var.f44418c.a(c1Var.f44422r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f44643b;
                c1Var2.f44418c.q(c1Var2.f44425x);
                return;
        }
    }
}
