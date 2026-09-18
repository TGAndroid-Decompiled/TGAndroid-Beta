package pg;
public final class x0 implements Runnable {
    public final int f41068a;
    public final y0 f41069b;

    public x0(y0 y0Var, int i10) {
        this.f41068a = i10;
        this.f41069b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f41068a) {
            case 0:
                a1 a1Var = this.f41069b.f41076b.d;
                if (a1Var != null) {
                    a1Var.postRunnable(a1Var.f40841w);
                    return;
                }
                return;
            case 1:
                a1 a1Var2 = this.f41069b.f41076b.d;
                if (a1Var2 != null) {
                    a1Var2.postRunnable(a1Var2.f40841w);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f41069b.f41076b;
                a1 a1Var3 = c1Var.d;
                a1Var3.getClass();
                a1Var3.postRunnable(new z0(a1Var3, 2));
                c1Var.d = null;
                return;
        }
    }
}
