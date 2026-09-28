package xh;

import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.x51;
public final class z0 extends g.p {
    public final r1 f46501c;

    public z0(r1 r1Var) {
        this.f46501c = r1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r1 r1Var = this.f46501c;
        pz pzVar = r1Var.f46377j0;
        l61 l61Var = r1Var.Y;
        if (l61Var != null && i10 != 0) {
            x51 G = l61Var.G(i10 - 1);
            if (G != null && (i11 = G.f30302u) != -1) {
                return i11;
            }
            return pzVar.J;
        }
        return pzVar.J;
    }
}
