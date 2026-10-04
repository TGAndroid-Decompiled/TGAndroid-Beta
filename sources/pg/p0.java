package pg;
public final class p0 implements Runnable {
    public final int f44555a;
    public final s0 f44556b;

    public p0(s0 s0Var, int i10) {
        this.f44555a = i10;
        this.f44556b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f44555a) {
            case 0:
                s0 s0Var = this.f44556b;
                s0Var.f44584c = null;
                l2.g gVar = s0Var.f44582a;
                if (gVar != null) {
                    gVar.m();
                    return;
                }
                return;
            default:
                this.f44556b.b();
                return;
        }
    }
}
