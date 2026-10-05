package pg;
public final class z0 implements Runnable {
    public final int f44713a;
    public final a1 f44714b;

    public z0(a1 a1Var, int i10) {
        this.f44713a = i10;
        this.f44714b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f44713a) {
            case 0:
                d1 d1Var = this.f44714b.f44440b.d;
                if (d1Var != null) {
                    d1Var.postRunnable(d1Var.f44463w);
                    return;
                }
                return;
            case 1:
                d1 d1Var2 = this.f44714b.f44440b.d;
                if (d1Var2 != null) {
                    d1Var2.postRunnable(d1Var2.f44463w);
                    return;
                }
                return;
            default:
                f1 f1Var = this.f44714b.f44440b;
                d1 d1Var3 = f1Var.d;
                d1Var3.getClass();
                d1Var3.postRunnable(new b1(d1Var3, 2));
                f1Var.d = null;
                return;
        }
    }
}
