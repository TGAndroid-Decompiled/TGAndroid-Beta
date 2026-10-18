package qg;
public final class p0 implements Runnable {
    public final int f44635a;
    public final s0 f44636b;

    public p0(s0 s0Var, int i10) {
        this.f44635a = i10;
        this.f44636b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f44635a) {
            case 0:
                s0 s0Var = this.f44636b;
                s0Var.f44667c = null;
                le.b bVar = s0Var.f44665a;
                if (bVar != null) {
                    bVar.a0();
                    return;
                }
                return;
            default:
                this.f44636b.b();
                return;
        }
    }
}
