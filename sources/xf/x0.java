package xf;
public final class x0 implements Runnable {
    public final int f49414a;
    public final y0 f49415b;

    public x0(y0 y0Var, int i9) {
        this.f49414a = i9;
        this.f49415b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f49414a) {
            case 0:
                a1 a1Var = this.f49415b.f49423b.d;
                if (a1Var != null) {
                    a1Var.postRunnable(a1Var.f49167w);
                    return;
                }
                return;
            case 1:
                a1 a1Var2 = this.f49415b.f49423b.d;
                if (a1Var2 != null) {
                    a1Var2.postRunnable(a1Var2.f49167w);
                    return;
                }
                return;
            default:
                c1 c1Var = this.f49415b.f49423b;
                a1 a1Var3 = c1Var.d;
                a1Var3.getClass();
                a1Var3.postRunnable(new z0(a1Var3, 2));
                c1Var.d = null;
                return;
        }
    }
}
