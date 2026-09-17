package pg;
public final class w0 implements Runnable {
    public final int f41055a;
    public final c1 f41056b;

    public w0(c1 c1Var, int i10) {
        this.f41055a = i10;
        this.f41056b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f41055a) {
            case 0:
                b1 b1Var = this.f41056b.f40846a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f41056b;
                c1Var.f40848c.a(c1Var.f40851r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f41056b;
                c1Var2.f40848c.q(c1Var2.f40854x);
                return;
        }
    }
}
