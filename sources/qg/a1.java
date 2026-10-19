package qg;
public final class a1 implements Runnable {
    public final int f44461a;
    public final b1 f44462b;

    public a1(b1 b1Var, int i10) {
        this.f44461a = i10;
        this.f44462b = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f44461a) {
            case 0:
                d1 d1Var = this.f44462b.f44467b.d;
                if (d1Var != null) {
                    d1Var.postRunnable(d1Var.f44484w);
                    return;
                }
                return;
            case 1:
                d1 d1Var2 = this.f44462b.f44467b.d;
                if (d1Var2 != null) {
                    d1Var2.postRunnable(d1Var2.f44484w);
                    return;
                }
                return;
            default:
                f1 f1Var = this.f44462b.f44467b;
                d1 d1Var3 = f1Var.d;
                d1Var3.getClass();
                d1Var3.postRunnable(new c1(d1Var3, 2));
                f1Var.d = null;
                return;
        }
    }
}
