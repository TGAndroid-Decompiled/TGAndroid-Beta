package xh;

import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.x51;
public final class l4 extends g.p {
    public final n4 f46328c;

    public l4(n4 n4Var) {
        this.f46328c = n4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        n4 n4Var = this.f46328c;
        pz pzVar = n4Var.f46376a0;
        l61 l61Var = n4Var.f46380e0;
        if (l61Var == null) {
            return pzVar.J;
        }
        x51 G = l61Var.G(i10 - 1);
        if (G != null && (i11 = G.f30311u) != -1) {
            return i11;
        }
        return pzVar.J;
    }
}
