package qg;
public final class a1 implements Runnable {
    public final int f44474a;
    public final b1 f44475b;

    public a1(b1 b1Var, int i10) {
        this.f44474a = i10;
        this.f44475b = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f44474a) {
            case 0:
                d1 d1Var = this.f44475b.f44480b.d;
                if (d1Var != null) {
                    d1Var.postRunnable(d1Var.f44497w);
                    return;
                }
                return;
            case 1:
                d1 d1Var2 = this.f44475b.f44480b.d;
                if (d1Var2 != null) {
                    d1Var2.postRunnable(d1Var2.f44497w);
                    return;
                }
                return;
            default:
                f1 f1Var = this.f44475b.f44480b;
                d1 d1Var3 = f1Var.d;
                d1Var3.getClass();
                d1Var3.postRunnable(new c1(d1Var3, 2));
                f1Var.d = null;
                return;
        }
    }
}
