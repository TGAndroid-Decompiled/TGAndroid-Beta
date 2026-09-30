package pg;
public final class y0 implements Runnable {
    public final int f41324a;
    public final f1 f41325b;

    public y0(f1 f1Var, int i10) {
        this.f41324a = i10;
        this.f41325b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f41324a) {
            case 0:
                e1 e1Var = this.f41325b.f41125a;
                if (e1Var != null) {
                    e1Var.b();
                    return;
                }
                return;
            case 1:
                f1 f1Var = this.f41325b;
                f1Var.f41127c.a(f1Var.f41130r);
                d1 d1Var = f1Var.d;
                d1Var.getClass();
                d1Var.postRunnable(new b1(d1Var, 2));
                f1Var.d = null;
                return;
            default:
                f1 f1Var2 = this.f41325b;
                f1Var2.f41127c.q(f1Var2.f41133x);
                return;
        }
    }
}
