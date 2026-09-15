package pg;
public final class w0 implements Runnable {
    public final int f41033a;
    public final c1 f41034b;

    public w0(c1 c1Var, int i10) {
        this.f41033a = i10;
        this.f41034b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f41033a) {
            case 0:
                b1 b1Var = this.f41034b.f40824a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f41034b;
                c1Var.f40826c.a(c1Var.f40829r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f41034b;
                c1Var2.f40826c.q(c1Var2.f40832x);
                return;
        }
    }
}
