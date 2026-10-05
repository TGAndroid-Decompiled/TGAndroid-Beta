package pg;
public final class y0 implements Runnable {
    public final int f44709a;
    public final f1 f44710b;

    public y0(f1 f1Var, int i10) {
        this.f44709a = i10;
        this.f44710b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f44709a) {
            case 0:
                e1 e1Var = this.f44710b.f44491a;
                if (e1Var != null) {
                    e1Var.b();
                    return;
                }
                return;
            case 1:
                f1 f1Var = this.f44710b;
                f1Var.f44493c.a(f1Var.f44497r);
                d1 d1Var = f1Var.d;
                d1Var.getClass();
                d1Var.postRunnable(new b1(d1Var, 2));
                f1Var.d = null;
                return;
            default:
                f1 f1Var2 = this.f44710b;
                f1Var2.f44493c.q(f1Var2.f44500x);
                return;
        }
    }
}
