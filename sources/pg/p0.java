package pg;
public final class p0 implements Runnable {
    public final int f44563a;
    public final s0 f44564b;

    public p0(s0 s0Var, int i10) {
        this.f44563a = i10;
        this.f44564b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f44563a) {
            case 0:
                s0 s0Var = this.f44564b;
                s0Var.f44592c = null;
                l2.g gVar = s0Var.f44590a;
                if (gVar != null) {
                    gVar.m();
                    return;
                }
                return;
            default:
                this.f44564b.b();
                return;
        }
    }
}
