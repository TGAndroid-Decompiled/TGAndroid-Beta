package pg;
public final class z0 implements Runnable {
    public final int f41312a;
    public final a1 f41313b;

    public z0(a1 a1Var, int i10) {
        this.f41312a = i10;
        this.f41313b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f41312a) {
            case 0:
                d1 d1Var = this.f41313b.f41061b.d;
                if (d1Var != null) {
                    d1Var.postRunnable(d1Var.f41082w);
                    return;
                }
                return;
            case 1:
                d1 d1Var2 = this.f41313b.f41061b.d;
                if (d1Var2 != null) {
                    d1Var2.postRunnable(d1Var2.f41082w);
                    return;
                }
                return;
            default:
                f1 f1Var = this.f41313b.f41061b;
                d1 d1Var3 = f1Var.d;
                d1Var3.getClass();
                d1Var3.postRunnable(new b1(d1Var3, 2));
                f1Var.d = null;
                return;
        }
    }
}
