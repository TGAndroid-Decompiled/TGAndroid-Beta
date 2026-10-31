package qh;
public final class d0 implements Runnable {
    public final int f45593a;
    public final i0 f45594b;

    public d0(i0 i0Var, int i10) {
        this.f45593a = i10;
        this.f45594b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f45593a) {
            case 0:
                i0 i0Var = this.f45594b;
                if (i0Var.h == null && i0Var.d != null && !i0Var.isFinished && i0Var.getParentActivity() != null) {
                    i0Var.f0(i0Var.d.H0(), 0.0f, true);
                    i0Var.h.setVisibility(4);
                    c cVar = i0Var.f45668y;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i0 i0Var2 = this.f45594b;
                c cVar2 = i0Var2.f45668y;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                i0Var2.l0();
                return;
            default:
                this.f45594b.j0();
                return;
        }
    }
}
