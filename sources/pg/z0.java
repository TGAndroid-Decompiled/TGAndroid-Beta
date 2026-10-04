package pg;
public final class z0 implements Runnable {
    public final int f44706a;
    public final a1 f44707b;

    public z0(a1 a1Var, int i10) {
        this.f44706a = i10;
        this.f44707b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f44706a) {
            case 0:
                d1 d1Var = this.f44707b.f44433b.d;
                if (d1Var != null) {
                    d1Var.postRunnable(d1Var.f44456w);
                    return;
                }
                return;
            case 1:
                d1 d1Var2 = this.f44707b.f44433b.d;
                if (d1Var2 != null) {
                    d1Var2.postRunnable(d1Var2.f44456w);
                    return;
                }
                return;
            default:
                f1 f1Var = this.f44707b.f44433b;
                d1 d1Var3 = f1Var.d;
                d1Var3.getClass();
                d1Var3.postRunnable(new b1(d1Var3, 2));
                f1Var.d = null;
                return;
        }
    }
}
