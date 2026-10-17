package qg;
public final class y0 implements Runnable {
    public final int f44733a;
    public final e1 f44734b;

    public y0(e1 e1Var, int i10) {
        this.f44733a = i10;
        this.f44734b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f44733a) {
            case 0:
                d1 d1Var = this.f44734b.f44535a;
                if (d1Var != null) {
                    d1Var.b();
                    return;
                }
                return;
            case 1:
                e1 e1Var = this.f44734b;
                e1Var.f44537c.a(e1Var.f44540r);
                c1 c1Var = e1Var.d;
                c1Var.getClass();
                c1Var.postRunnable(new b1(c1Var, 2));
                e1Var.d = null;
                return;
            default:
                e1 e1Var2 = this.f44734b;
                e1Var2.f44537c.q(e1Var2.f44543x);
                return;
        }
    }
}
