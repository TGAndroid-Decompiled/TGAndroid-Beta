package pg;
public final class y0 implements Runnable {
    public final int f41308a;
    public final e1 f41309b;

    public y0(e1 e1Var, int i10) {
        this.f41308a = i10;
        this.f41309b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f41308a) {
            case 0:
                d1 d1Var = this.f41309b.f41107a;
                if (d1Var != null) {
                    d1Var.b();
                    return;
                }
                return;
            case 1:
                e1 e1Var = this.f41309b;
                e1Var.f41109c.a(e1Var.f41112r);
                c1 c1Var = e1Var.d;
                c1Var.getClass();
                c1Var.postRunnable(new b1(c1Var, 2));
                e1Var.d = null;
                return;
            default:
                e1 e1Var2 = this.f41309b;
                e1Var2.f41109c.q(e1Var2.f41115x);
                return;
        }
    }
}
