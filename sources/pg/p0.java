package pg;
public final class p0 implements Runnable {
    public final int f41226a;
    public final s0 f41227b;

    public p0(s0 s0Var, int i10) {
        this.f41226a = i10;
        this.f41227b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f41226a) {
            case 0:
                s0 s0Var = this.f41227b;
                s0Var.f41263c = null;
                n2.e eVar = s0Var.f41261a;
                if (eVar != null) {
                    eVar.p();
                    return;
                }
                return;
            default:
                this.f41227b.b();
                return;
        }
    }
}
