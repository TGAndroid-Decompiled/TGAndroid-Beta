package zh;
public final class p2 implements Runnable {
    public final int f48771a;
    public final v2 f48772b;

    public p2(v2 v2Var, int i10) {
        this.f48771a = i10;
        this.f48772b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f48771a) {
            case 0:
                ((l7) this.f48772b.f48986l.Q1).g(false);
                return;
            case 1:
                a3 a3Var = this.f48772b.f48986l;
                w2 w2Var = a3Var.Q1;
                if (w2Var != null) {
                    u7 u7Var = ((l7) w2Var).d;
                    u7Var.Z0 = false;
                    u7Var.P();
                }
                a3Var.f1(false);
                a3Var.f48179h3 = true;
                a3Var.K0.D(true);
                return;
            case 2:
                a3 a3Var2 = this.f48772b.f48986l;
                a3Var2.U3 = true;
                a3Var2.setActive(false);
                return;
            default:
                a3 a3Var3 = this.f48772b.f48986l;
                a3Var3.U3 = true;
                a3Var3.setActive(false);
                return;
        }
    }
}
