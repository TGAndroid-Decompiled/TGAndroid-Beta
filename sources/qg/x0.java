package qg;
public final class x0 implements Runnable {
    public final int f44651a;
    public final y0 f44652b;

    public x0(y0 y0Var, int i10) {
        this.f44651a = i10;
        this.f44652b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f44651a) {
            case 0:
                a1 a1Var = this.f44652b.f44660b.d;
                if (a1Var != null) {
                    a1Var.postRunnable(a1Var.f44405w);
                    return;
                }
                return;
            case 1:
                a1 a1Var2 = this.f44652b.f44660b.d;
                if (a1Var2 != null) {
                    a1Var2.postRunnable(a1Var2.f44405w);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f44652b.f44660b;
                a1 a1Var3 = c1Var.d;
                a1Var3.getClass();
                a1Var3.postRunnable(new z0(a1Var3, 2));
                c1Var.d = null;
                return;
        }
    }
}
