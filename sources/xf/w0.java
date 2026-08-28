package xf;
public final class w0 implements Runnable {
    public final int f49405a;
    public final c1 f49406b;

    public w0(c1 c1Var, int i9) {
        this.f49405a = i9;
        this.f49406b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f49405a) {
            case 0:
                b1 b1Var = this.f49406b.f49178a;
                if (b1Var != null) {
                    b1Var.b();
                    return;
                }
                return;
            case 1:
                c1 c1Var = this.f49406b;
                c1Var.f49180c.a(c1Var.f49184r);
                a1 a1Var = c1Var.d;
                a1Var.getClass();
                a1Var.postRunnable(new z0(a1Var, 2));
                c1Var.d = null;
                return;
            default:
                c1 c1Var2 = this.f49406b;
                c1Var2.f49180c.q(c1Var2.f49187x);
                return;
        }
    }
}
