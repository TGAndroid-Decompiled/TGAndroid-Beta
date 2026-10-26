package rg;
public final class w0 implements Runnable {
    public final int f47585a;
    public final c1 f47586b;

    public w0(c1 c1Var, int i10) {
        this.f47585a = i10;
        this.f47586b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f47585a) {
            case 0:
                b1 b1Var = this.f47586b.f47375a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f47586b;
                c1Var.f47377c.a(c1Var.f47380r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f47586b;
                c1Var2.f47377c.q(c1Var2.f47383x);
                return;
        }
    }
}
