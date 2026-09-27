package pg;
public final class y0 implements Runnable {
    public final int f41320a;
    public final f1 f41321b;

    public y0(f1 f1Var, int i10) {
        this.f41320a = i10;
        this.f41321b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f41320a) {
            case 0:
                e1 e1Var = this.f41321b.f41121a;
                if (e1Var != null) {
                    e1Var.b();
                    return;
                }
                return;
            case 1:
                f1 f1Var = this.f41321b;
                f1Var.f41123c.a(f1Var.f41126r);
                d1 d1Var = f1Var.d;
                d1Var.getClass();
                d1Var.postRunnable(new b1(d1Var, 2));
                f1Var.d = null;
                return;
            default:
                f1 f1Var2 = this.f41321b;
                f1Var2.f41123c.q(f1Var2.f41129x);
                return;
        }
    }
}
