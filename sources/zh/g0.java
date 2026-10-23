package zh;
public final class g0 implements Runnable {
    public final int f52481a;
    public final n0 f52482b;

    public g0(n0 n0Var, int i10) {
        this.f52481a = i10;
        this.f52482b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f52481a) {
            case 0:
                n0 n0Var = this.f52482b;
                if (n0Var.h == null && n0Var.d != null && !n0Var.isFinished && n0Var.getParentActivity() != null) {
                    n0Var.b0(n0Var.d.H0(), 0.0f, true);
                    n0Var.h.setVisibility(4);
                    c cVar = n0Var.f52528x;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                n0 n0Var2 = this.f52482b;
                c cVar2 = n0Var2.f52528x;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                n0Var2.h0();
                return;
            default:
                this.f52482b.f0();
                return;
        }
    }
}
