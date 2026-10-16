package qg;
public final class x0 implements Runnable {
    public final int f43356a;
    public final y0 f43357b;

    public x0(y0 y0Var, int i10) {
        this.f43356a = i10;
        this.f43357b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f43356a) {
            case 0:
                a1 a1Var = this.f43357b.f43364b.d;
                if (a1Var != null) {
                    a1Var.postRunnable(a1Var.f43129w);
                    return;
                }
                return;
            case 1:
                a1 a1Var2 = this.f43357b.f43364b.d;
                if (a1Var2 != null) {
                    a1Var2.postRunnable(a1Var2.f43129w);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f43357b.f43364b;
                a1 a1Var3 = c1Var.d;
                a1Var3.getClass();
                a1Var3.postRunnable(new z0(a1Var3, 2));
                c1Var.d = null;
                return;
        }
    }
}
