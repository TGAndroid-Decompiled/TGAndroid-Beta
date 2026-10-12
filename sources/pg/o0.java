package pg;
public final class o0 implements Runnable {
    public final int f45600a;
    public final r0 f45601b;

    public o0(r0 r0Var, int i10) {
        this.f45600a = i10;
        this.f45601b = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f45600a) {
            case 0:
                r0 r0Var = this.f45601b;
                r0Var.f45635c = null;
                k2.g0 g0Var = r0Var.f45633a;
                if (g0Var != null) {
                    g0Var.e();
                    return;
                }
                return;
            default:
                this.f45601b.b();
                return;
        }
    }
}
