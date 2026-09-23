package pg;
public final class y0 implements Runnable {
    public final int f41000a;
    public final z0 f41001b;

    public y0(z0 z0Var, int i10) {
        this.f41000a = i10;
        this.f41001b = z0Var;
    }

    @Override
    public final void run() {
        switch (this.f41000a) {
            case 0:
                b1 b1Var = this.f41001b.f41005b.d;
                if (b1Var != null) {
                    b1Var.postRunnable(b1Var.f40770w);
                    return;
                }
                return;
            case 1:
                b1 b1Var2 = this.f41001b.f41005b.d;
                if (b1Var2 != null) {
                    b1Var2.postRunnable(b1Var2.f40770w);
                    return;
                }
                return;
            default:
                d1 d1Var = this.f41001b.f41005b;
                b1 b1Var3 = d1Var.d;
                b1Var3.getClass();
                b1Var3.postRunnable(new a1(b1Var3, 2));
                d1Var.d = null;
                return;
        }
    }
}
