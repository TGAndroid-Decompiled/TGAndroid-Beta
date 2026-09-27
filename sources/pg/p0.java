package pg;
public final class p0 implements Runnable {
    public final int f41195a;
    public final s0 f41196b;

    public p0(s0 s0Var, int i10) {
        this.f41195a = i10;
        this.f41196b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f41195a) {
            case 0:
                s0 s0Var = this.f41196b;
                s0Var.f41221c = null;
                o0.c cVar = s0Var.f41219a;
                if (cVar != null) {
                    cVar.v();
                    return;
                }
                return;
            default:
                this.f41196b.b();
                return;
        }
    }
}
