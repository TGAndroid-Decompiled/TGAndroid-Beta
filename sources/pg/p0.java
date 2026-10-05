package pg;
public final class p0 implements Runnable {
    public final int f44570a;
    public final s0 f44571b;

    public p0(s0 s0Var, int i10) {
        this.f44570a = i10;
        this.f44571b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f44570a) {
            case 0:
                s0 s0Var = this.f44571b;
                s0Var.f44599c = null;
                l2.g gVar = s0Var.f44597a;
                if (gVar != null) {
                    gVar.V();
                    return;
                }
                return;
            default:
                this.f44571b.b();
                return;
        }
    }
}
