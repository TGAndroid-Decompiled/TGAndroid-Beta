package xh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.v51;
public final class z0 extends g.p {
    public final r1 f46172c;

    public z0(r1 r1Var) {
        this.f46172c = r1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r1 r1Var = this.f46172c;
        oz ozVar = r1Var.f46048j0;
        v51 v51Var = r1Var.Y;
        if (v51Var != null && i10 != 0) {
            h51 G = v51Var.G(i10 - 1);
            if (G != null && (i11 = G.f24516u) != -1) {
                return i11;
            }
            return ozVar.J;
        }
        return ozVar.J;
    }
}
