package pg;
public final class x0 implements Runnable {
    public final int f45731a;
    public final d1 f45732b;

    public x0(d1 d1Var, int i10) {
        this.f45731a = i10;
        this.f45732b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f45731a) {
            case 0:
                c1 c1Var = this.f45732b.f45520a;
                if (c1Var != null) {
                    c1Var.b();
                    return;
                }
                return;
            case 1:
                d1 d1Var = this.f45732b;
                d1Var.f45522c.a(d1Var.f45526r);
                b1 b1Var = d1Var.d;
                b1Var.getClass();
                b1Var.postRunnable(new a1(b1Var, 2));
                d1Var.d = null;
                return;
            default:
                d1 d1Var2 = this.f45732b;
                d1Var2.f45522c.q(d1Var2.f45529x);
                return;
        }
    }
}
