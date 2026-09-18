package pg;
public final class p0 implements Runnable {
    public final int f41185a;
    public final s0 f41186b;

    public p0(s0 s0Var, int i10) {
        this.f41185a = i10;
        this.f41186b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f41185a) {
            case 0:
                s0 s0Var = this.f41186b;
                s0Var.f41222c = null;
                n2.e eVar = s0Var.f41220a;
                if (eVar != null) {
                    eVar.t();
                    return;
                }
                return;
            default:
                this.f41186b.b();
                return;
        }
    }
}
