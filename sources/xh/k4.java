package xh;

import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.y51;
public final class k4 extends g.p {
    public final m4 f46293c;

    public k4(m4 m4Var) {
        this.f46293c = m4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.f46293c;
        nz nzVar = m4Var.f46334a0;
        m61 m61Var = m4Var.f46338e0;
        if (m61Var == null) {
            return nzVar.J;
        }
        y51 G = m61Var.G(i10 - 1);
        if (G != null && (i11 = G.f30527u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
