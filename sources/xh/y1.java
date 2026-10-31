package xh;
public final class y1 extends org.telegram.ui.ActionBar.k {
    public final int f54112a;
    public final m2 f54113b;

    public y1(m2 m2Var, int i10) {
        this.f54112a = i10;
        this.f54113b = m2Var;
    }

    @Override
    public final void b(int i10) {
        int i11 = this.f54112a;
        m2 m2Var = this.f54113b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    if (!m2Var.D.C()) {
                        m2Var.v();
                        return;
                    }
                    return;
                } else if (i10 == 2131296492) {
                    m2Var.f53907y0 = true;
                    m2Var.o(true);
                    return;
                } else {
                    return;
                }
            default:
                if (i10 == -1) {
                    m2Var.v();
                    return;
                }
                return;
        }
    }
}
