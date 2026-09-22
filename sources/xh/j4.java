package xh;

import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;
public final class j4 extends g.p {
    public final l4 f45939c;

    public j4(l4 l4Var) {
        this.f45939c = l4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.f45939c;
        nz nzVar = l4Var.f45974a0;
        w51 w51Var = l4Var.f45978e0;
        if (w51Var == null) {
            return nzVar.J;
        }
        i51 G = w51Var.G(i10 - 1);
        if (G != null && (i11 = G.f24909u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
