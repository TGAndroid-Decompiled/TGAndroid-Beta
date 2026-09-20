package pg;
public final class z0 implements Runnable {
    public final int f41353a;
    public final a1 f41354b;

    public z0(a1 a1Var, int i10) {
        this.f41353a = i10;
        this.f41354b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f41353a) {
            case 0:
                c1 c1Var = this.f41354b.f41104b.d;
                if (c1Var != null) {
                    c1Var.postRunnable(c1Var.f41121w);
                    return;
                }
                return;
            case 1:
                c1 c1Var2 = this.f41354b.f41104b.d;
                if (c1Var2 != null) {
                    c1Var2.postRunnable(c1Var2.f41121w);
                    return;
                }
                return;
            default:
                e1 e1Var = this.f41354b.f41104b;
                c1 c1Var3 = e1Var.d;
                c1Var3.getClass();
                c1Var3.postRunnable(new b1(c1Var3, 2));
                e1Var.d = null;
                return;
        }
    }
}
