package xh;

import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.x51;
public final class j4 extends g.p {
    public final l4 f45966c;

    public j4(l4 l4Var) {
        this.f45966c = l4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.f45966c;
        nz nzVar = l4Var.f46001a0;
        x51 x51Var = l4Var.f46005e0;
        if (x51Var == null) {
            return nzVar.J;
        }
        j51 G = x51Var.G(i10 - 1);
        if (G != null && (i11 = G.f25133u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
