package pg;
public final class y0 implements Runnable {
    public final int f41349a;
    public final e1 f41350b;

    public y0(e1 e1Var, int i10) {
        this.f41349a = i10;
        this.f41350b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f41349a) {
            case 0:
                d1 d1Var = this.f41350b.f41148a;
                if (d1Var != null) {
                    d1Var.b();
                    return;
                }
                return;
            case 1:
                e1 e1Var = this.f41350b;
                e1Var.f41150c.a(e1Var.f41153r);
                c1 c1Var = e1Var.d;
                c1Var.getClass();
                c1Var.postRunnable(new b1(c1Var, 2));
                e1Var.d = null;
                return;
            default:
                e1 e1Var2 = this.f41350b;
                e1Var2.f41150c.q(e1Var2.f41156x);
                return;
        }
    }
}
