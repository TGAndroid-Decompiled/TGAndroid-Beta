package qg;
public final class z0 implements Runnable {
    public final int f44740a;
    public final a1 f44741b;

    public z0(a1 a1Var, int i10) {
        this.f44740a = i10;
        this.f44741b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f44740a) {
            case 0:
                c1 c1Var = this.f44741b.f44490b.d;
                if (c1Var != null) {
                    c1Var.postRunnable(c1Var.f44506w);
                    return;
                }
                return;
            case 1:
                c1 c1Var2 = this.f44741b.f44490b.d;
                if (c1Var2 != null) {
                    c1Var2.postRunnable(c1Var2.f44506w);
                    return;
                }
                return;
            default:
                e1 e1Var = this.f44741b.f44490b;
                c1 c1Var3 = e1Var.d;
                c1Var3.getClass();
                c1Var3.postRunnable(new b1(c1Var3, 2));
                e1Var.d = null;
                return;
        }
    }
}
