package xh;

import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;
public final class k4 extends g.p {
    public final m4 f46272c;

    public k4(m4 m4Var) {
        this.f46272c = m4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.f46272c;
        nz nzVar = m4Var.f46313a0;
        k61 k61Var = m4Var.f46317e0;
        if (k61Var == null) {
            return nzVar.J;
        }
        w51 G = k61Var.G(i10 - 1);
        if (G != null && (i11 = G.f29957u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
