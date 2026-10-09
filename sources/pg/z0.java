package pg;
public final class z0 implements Runnable {
    public final int f45855a;
    public final a1 f45856b;

    public z0(a1 a1Var, int i10) {
        this.f45855a = i10;
        this.f45856b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f45855a) {
            case 0:
                c1 c1Var = this.f45856b.f45585b.d;
                if (c1Var != null) {
                    c1Var.postRunnable(c1Var.f45604w);
                    return;
                }
                return;
            case 1:
                c1 c1Var2 = this.f45856b.f45585b.d;
                if (c1Var2 != null) {
                    c1Var2.postRunnable(c1Var2.f45604w);
                    return;
                }
                return;
            default:
                e1 e1Var = this.f45856b.f45585b;
                c1 c1Var3 = e1Var.d;
                c1Var3.getClass();
                c1Var3.postRunnable(new b1(c1Var3, 2));
                e1Var.d = null;
                return;
        }
    }
}
