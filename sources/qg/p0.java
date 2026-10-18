package qg;
public final class p0 implements Runnable {
    public final int f44588a;
    public final s0 f44589b;

    public p0(s0 s0Var, int i10) {
        this.f44588a = i10;
        this.f44589b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f44588a) {
            case 0:
                s0 s0Var = this.f44589b;
                s0Var.f44625c = null;
                le.b bVar = s0Var.f44623a;
                if (bVar != null) {
                    bVar.a0();
                    return;
                }
                return;
            default:
                this.f44589b.b();
                return;
        }
    }
}
