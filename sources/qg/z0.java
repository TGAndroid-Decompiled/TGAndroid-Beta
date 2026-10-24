package qg;
public final class z0 implements Runnable {
    public final int f45138a;
    public final a1 f45139b;

    public z0(a1 a1Var, int i10) {
        this.f45138a = i10;
        this.f45139b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f45138a) {
            case 0:
                c1 c1Var = this.f45139b.f44888b.d;
                if (c1Var != null) {
                    c1Var.postRunnable(c1Var.f44904w);
                    return;
                }
                return;
            case 1:
                c1 c1Var2 = this.f45139b.f44888b.d;
                if (c1Var2 != null) {
                    c1Var2.postRunnable(c1Var2.f44904w);
                    return;
                }
                return;
            default:
                e1 e1Var = this.f45139b.f44888b;
                c1 c1Var3 = e1Var.d;
                c1Var3.getClass();
                c1Var3.postRunnable(new b1(c1Var3, 2));
                e1Var.d = null;
                return;
        }
    }
}
