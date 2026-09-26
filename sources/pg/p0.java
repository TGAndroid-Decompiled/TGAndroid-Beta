package pg;
public final class p0 implements Runnable {
    public final int f41197a;
    public final s0 f41198b;

    public p0(s0 s0Var, int i10) {
        this.f41197a = i10;
        this.f41198b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f41197a) {
            case 0:
                s0 s0Var = this.f41198b;
                s0Var.f41223c = null;
                n2.e eVar = s0Var.f41221a;
                if (eVar != null) {
                    eVar.t();
                    return;
                }
                return;
            default:
                this.f41198b.b();
                return;
        }
    }
}
