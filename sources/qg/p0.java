package qg;
public final class p0 implements Runnable {
    public final int f44615a;
    public final s0 f44616b;

    public p0(s0 s0Var, int i10) {
        this.f44615a = i10;
        this.f44616b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f44615a) {
            case 0:
                s0 s0Var = this.f44616b;
                s0Var.f44647c = null;
                le.b bVar = s0Var.f44645a;
                if (bVar != null) {
                    bVar.a0();
                    return;
                }
                return;
            default:
                this.f44616b.b();
                return;
        }
    }
}
