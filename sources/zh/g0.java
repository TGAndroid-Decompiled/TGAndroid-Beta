package zh;
public final class g0 implements Runnable {
    public final int f52008a;
    public final m0 f52009b;

    public g0(m0 m0Var, int i10) {
        this.f52008a = i10;
        this.f52009b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f52008a) {
            case 0:
                m0 m0Var = this.f52009b;
                if (m0Var.h == null && m0Var.d != null && !m0Var.isFinished && m0Var.getParentActivity() != null) {
                    m0Var.b0(m0Var.d.H0(), 0.0f, true);
                    m0Var.h.setVisibility(4);
                    c cVar = m0Var.f52049x;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f52009b;
                c cVar2 = m0Var2.f52049x;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                m0Var2.h0();
                return;
            default:
                this.f52009b.f0();
                return;
        }
    }
}
