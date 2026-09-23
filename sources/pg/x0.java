package pg;
public final class x0 implements Runnable {
    public final int f40993a;
    public final d1 f40994b;

    public x0(d1 d1Var, int i10) {
        this.f40993a = i10;
        this.f40994b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f40993a) {
            case 0:
                c1 c1Var = this.f40994b.f40799a;
                if (c1Var != null) {
                    c1Var.b();
                    return;
                }
                return;
            case 1:
                d1 d1Var = this.f40994b;
                d1Var.f40801c.a(d1Var.f40804r);
                b1 b1Var = d1Var.d;
                b1Var.getClass();
                b1Var.postRunnable(new a1(b1Var, 2));
                d1Var.d = null;
                return;
            default:
                d1 d1Var2 = this.f40994b;
                d1Var2.f40801c.q(d1Var2.f40807x);
                return;
        }
    }
}
