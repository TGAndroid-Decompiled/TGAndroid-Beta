package pg;
public final class y0 implements Runnable {
    public final int f45851a;
    public final e1 f45852b;

    public y0(e1 e1Var, int i10) {
        this.f45851a = i10;
        this.f45852b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f45851a) {
            case 0:
                d1 d1Var = this.f45852b.f45631a;
                if (d1Var != null) {
                    d1Var.b();
                    return;
                }
                return;
            case 1:
                e1 e1Var = this.f45852b;
                e1Var.f45633c.a(e1Var.f45637r);
                c1 c1Var = e1Var.d;
                c1Var.getClass();
                c1Var.postRunnable(new b1(c1Var, 2));
                e1Var.d = null;
                return;
            default:
                e1 e1Var2 = this.f45852b;
                e1Var2.f45633c.q(e1Var2.f45640x);
                return;
        }
    }
}
