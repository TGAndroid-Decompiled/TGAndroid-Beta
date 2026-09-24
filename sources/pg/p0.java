package pg;
public final class p0 implements Runnable {
    public final int f41183a;
    public final s0 f41184b;

    public p0(s0 s0Var, int i10) {
        this.f41183a = i10;
        this.f41184b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f41183a) {
            case 0:
                s0 s0Var = this.f41184b;
                s0Var.f41209c = null;
                n2.e eVar = s0Var.f41207a;
                if (eVar != null) {
                    eVar.t();
                    return;
                }
                return;
            default:
                this.f41184b.b();
                return;
        }
    }
}
