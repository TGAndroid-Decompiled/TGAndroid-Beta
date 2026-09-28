package pg;
public final class p0 implements Runnable {
    public final int f41198a;
    public final s0 f41199b;

    public p0(s0 s0Var, int i10) {
        this.f41198a = i10;
        this.f41199b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f41198a) {
            case 0:
                s0 s0Var = this.f41199b;
                s0Var.f41224c = null;
                n2.e eVar = s0Var.f41222a;
                if (eVar != null) {
                    eVar.t();
                    return;
                }
                return;
            default:
                this.f41199b.b();
                return;
        }
    }
}
