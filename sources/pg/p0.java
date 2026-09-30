package pg;
public final class p0 implements Runnable {
    public final int f41199a;
    public final s0 f41200b;

    public p0(s0 s0Var, int i10) {
        this.f41199a = i10;
        this.f41200b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f41199a) {
            case 0:
                s0 s0Var = this.f41200b;
                s0Var.f41225c = null;
                n2.e eVar = s0Var.f41223a;
                if (eVar != null) {
                    eVar.t();
                    return;
                }
                return;
            default:
                this.f41200b.b();
                return;
        }
    }
}
