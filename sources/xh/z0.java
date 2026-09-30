package xh;

import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.y51;
public final class z0 extends g.p {
    public final r1 f46608c;

    public z0(r1 r1Var) {
        this.f46608c = r1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r1 r1Var = this.f46608c;
        qz qzVar = r1Var.f46484j0;
        m61 m61Var = r1Var.Y;
        if (m61Var != null && i10 != 0) {
            y51 G = m61Var.G(i10 - 1);
            if (G != null && (i11 = G.f30646u) != -1) {
                return i11;
            }
            return qzVar.J;
        }
        return qzVar.J;
    }
}
