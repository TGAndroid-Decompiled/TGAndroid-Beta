package qh;
public final class d0 implements Runnable {
    public final int f45604a;
    public final i0 f45605b;

    public d0(i0 i0Var, int i10) {
        this.f45604a = i10;
        this.f45605b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f45604a) {
            case 0:
                i0 i0Var = this.f45605b;
                if (i0Var.h == null && i0Var.d != null && !i0Var.isFinished && i0Var.getParentActivity() != null) {
                    i0Var.g0(i0Var.d.H0(), 0.0f, true);
                    i0Var.h.setVisibility(4);
                    c cVar = i0Var.f45679y;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i0 i0Var2 = this.f45605b;
                c cVar2 = i0Var2.f45679y;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                i0Var2.m0();
                return;
            default:
                this.f45605b.k0();
                return;
        }
    }
}
