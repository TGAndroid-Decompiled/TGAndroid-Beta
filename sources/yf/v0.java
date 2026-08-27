package yf;

public final class v0 implements Runnable {

    public final int f50102a;

    public final b1 f50103b;

    public v0(b1 b1Var, int i10) {
        this.f50102a = i10;
        this.f50103b = b1Var;
    }

    @Override
    public final void run() {
        switch (this.f50102a) {
            case 0:
                a1 a1Var = this.f50103b.f49878a;
                if (a1Var != null) {
                    a1Var.b();
                }
                break;
            case 1:
                b1 b1Var = this.f50103b;
                b1Var.f49880c.a(b1Var.f49884r);
                z0 z0Var = b1Var.d;
                z0Var.getClass();
                z0Var.postRunnable(new y0(z0Var, 2));
                b1Var.d = null;
                break;
            default:
                b1 b1Var2 = this.f50103b;
                b1Var2.f49880c.q(b1Var2.f49887x);
                break;
        }
    }
}
