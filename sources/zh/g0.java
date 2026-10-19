package zh;
public final class g0 implements Runnable {
    public final int f52010a;
    public final m0 f52011b;

    public g0(m0 m0Var, int i10) {
        this.f52010a = i10;
        this.f52011b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f52010a) {
            case 0:
                m0 m0Var = this.f52011b;
                if (m0Var.h == null && m0Var.d != null && !m0Var.isFinished && m0Var.getParentActivity() != null) {
                    m0Var.b0(m0Var.d.H0(), 0.0f, true);
                    m0Var.h.setVisibility(4);
                    c cVar = m0Var.f52051x;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f52011b;
                c cVar2 = m0Var2.f52051x;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                m0Var2.h0();
                return;
            default:
                this.f52011b.f0();
                return;
        }
    }
}
