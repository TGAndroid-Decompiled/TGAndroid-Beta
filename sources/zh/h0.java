package zh;
public final class h0 implements Runnable {
    public final int f52023a;
    public final m0 f52024b;

    public h0(m0 m0Var, int i10) {
        this.f52023a = i10;
        this.f52024b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f52023a) {
            case 0:
                m0 m0Var = this.f52024b;
                if (m0Var.h == null && m0Var.d != null && !m0Var.isFinished && m0Var.getParentActivity() != null) {
                    m0Var.a0(m0Var.d.D0(), 0.0f, true);
                    m0Var.h.setVisibility(4);
                    c cVar = m0Var.f52066x;
                    if (cVar != null) {
                        cVar.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m0 m0Var2 = this.f52024b;
                c cVar2 = m0Var2.f52066x;
                if (cVar2 != null) {
                    cVar2.invalidate();
                }
                m0Var2.f0();
                return;
            default:
                this.f52024b.e0();
                return;
        }
    }
}
