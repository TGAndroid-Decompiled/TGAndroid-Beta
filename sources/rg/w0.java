package rg;
public final class w0 implements Runnable {
    public final int f47620a;
    public final c1 f47621b;

    public w0(c1 c1Var, int i10) {
        this.f47620a = i10;
        this.f47621b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f47620a) {
            case 0:
                b1 b1Var = this.f47621b.f47410a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f47621b;
                c1Var.f47412c.a(c1Var.f47415r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f47621b;
                c1Var2.f47412c.q(c1Var2.f47418x);
                return;
        }
    }
}
