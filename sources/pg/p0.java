package pg;
public final class p0 implements Runnable {
    public final int f44556a;
    public final s0 f44557b;

    public p0(s0 s0Var, int i10) {
        this.f44556a = i10;
        this.f44557b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f44556a) {
            case 0:
                s0 s0Var = this.f44557b;
                s0Var.f44585c = null;
                l2.g gVar = s0Var.f44583a;
                if (gVar != null) {
                    gVar.m();
                    return;
                }
                return;
            default:
                this.f44557b.b();
                return;
        }
    }
}
