package qg;
public final class w0 implements Runnable {
    public final int f44641a;
    public final c1 f44642b;

    public w0(c1 c1Var, int i10) {
        this.f44641a = i10;
        this.f44642b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f44641a) {
            case 0:
                b1 b1Var = this.f44642b.f44415a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f44642b;
                c1Var.f44417c.a(c1Var.f44421r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f44642b;
                c1Var2.f44417c.q(c1Var2.f44424x);
                return;
        }
    }
}
