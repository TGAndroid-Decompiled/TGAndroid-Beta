package xh;

import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.v51;
public final class z0 extends g.p {
    public final r1 f46500c;

    public z0(r1 r1Var) {
        this.f46500c = r1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r1 r1Var = this.f46500c;
        oz ozVar = r1Var.f46376j0;
        j61 j61Var = r1Var.Y;
        if (j61Var != null && i10 != 0) {
            v51 G = j61Var.G(i10 - 1);
            if (G != null && (i11 = G.f29057u) != -1) {
                return i11;
            }
            return ozVar.J;
        }
        return ozVar.J;
    }
}
