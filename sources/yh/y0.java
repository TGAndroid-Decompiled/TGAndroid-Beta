package yh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.v51;
public final class y0 extends g.p {
    public final p1 f50679c;

    public y0(p1 p1Var) {
        this.f50679c = p1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        p1 p1Var = this.f50679c;
        nz nzVar = p1Var.f50521j0;
        v51 v51Var = p1Var.Y;
        if (v51Var != null && i10 != 0) {
            h51 G = v51Var.G(i10 - 1);
            if (G != null && (i11 = G.f26630u) != -1) {
                return i11;
            }
            return nzVar.J;
        }
        return nzVar.J;
    }
}
