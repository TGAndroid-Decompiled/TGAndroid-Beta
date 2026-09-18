package xh;

import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.x51;
public final class z0 extends g.p {
    public final r1 f46473c;

    public z0(r1 r1Var) {
        this.f46473c = r1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r1 r1Var = this.f46473c;
        nz nzVar = r1Var.f46349j0;
        l61 l61Var = r1Var.Y;
        if (l61Var != null && i10 != 0) {
            x51 G = l61Var.G(i10 - 1);
            if (G != null && (i11 = G.f30257u) != -1) {
                return i11;
            }
            return nzVar.J;
        }
        return nzVar.J;
    }
}
