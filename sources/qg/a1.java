package qg;
public final class a1 implements Runnable {
    public final int f44475a;
    public final b1 f44476b;

    public a1(b1 b1Var, int i10) {
        this.f44475a = i10;
        this.f44476b = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f44475a) {
            case 0:
                d1 d1Var = this.f44476b.f44481b.d;
                if (d1Var != null) {
                    d1Var.postRunnable(d1Var.f44498w);
                    return;
                }
                return;
            case 1:
                d1 d1Var2 = this.f44476b.f44481b.d;
                if (d1Var2 != null) {
                    d1Var2.postRunnable(d1Var2.f44498w);
                    return;
                }
                return;
            default:
                f1 f1Var = this.f44476b.f44481b;
                d1 d1Var3 = f1Var.d;
                d1Var3.getClass();
                d1Var3.postRunnable(new c1(d1Var3, 2));
                f1Var.d = null;
                return;
        }
    }
}
