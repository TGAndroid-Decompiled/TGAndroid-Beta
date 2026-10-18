package qg;
public final class z0 implements Runnable {
    public final int f44760a;
    public final a1 f44761b;

    public z0(a1 a1Var, int i10) {
        this.f44760a = i10;
        this.f44761b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f44760a) {
            case 0:
                c1 c1Var = this.f44761b.f44510b.d;
                if (c1Var != null) {
                    c1Var.postRunnable(c1Var.f44526w);
                    return;
                }
                return;
            case 1:
                c1 c1Var2 = this.f44761b.f44510b.d;
                if (c1Var2 != null) {
                    c1Var2.postRunnable(c1Var2.f44526w);
                    return;
                }
                return;
            default:
                e1 e1Var = this.f44761b.f44510b;
                c1 c1Var3 = e1Var.d;
                c1Var3.getClass();
                c1Var3.postRunnable(new b1(c1Var3, 2));
                e1Var.d = null;
                return;
        }
    }
}
