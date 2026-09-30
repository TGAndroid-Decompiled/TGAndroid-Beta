package pg;
public final class p0 implements Runnable {
    public final int f41296a;
    public final s0 f41297b;

    public p0(s0 s0Var, int i10) {
        this.f41296a = i10;
        this.f41297b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f41296a) {
            case 0:
                s0 s0Var = this.f41297b;
                s0Var.f41322c = null;
                n2.e eVar = s0Var.f41320a;
                if (eVar != null) {
                    eVar.t();
                    return;
                }
                return;
            default:
                this.f41297b.b();
                return;
        }
    }
}
