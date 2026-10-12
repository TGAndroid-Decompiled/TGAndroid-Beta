package pg;
public final class o0 implements Runnable {
    public final int f45595a;
    public final r0 f45596b;

    public o0(r0 r0Var, int i10) {
        this.f45595a = i10;
        this.f45596b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f45595a) {
            case 0:
                r0 r0Var = this.f45596b;
                r0Var.f45630c = null;
                k2.g0 g0Var = r0Var.f45628a;
                if (g0Var != null) {
                    g0Var.e();
                    return;
                }
                return;
            default:
                this.f45596b.b();
                return;
        }
    }
}
