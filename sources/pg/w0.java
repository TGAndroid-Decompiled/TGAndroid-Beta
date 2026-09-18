package pg;
public final class w0 implements Runnable {
    public final int f41060a;
    public final c1 f41061b;

    public w0(c1 c1Var, int i10) {
        this.f41060a = i10;
        this.f41061b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f41060a) {
            case 0:
                b1 b1Var = this.f41061b.f40851a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f41061b;
                c1Var.f40853c.a(c1Var.f40856r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f41061b;
                c1Var2.f40853c.q(c1Var2.f40859x);
                return;
        }
    }
}
