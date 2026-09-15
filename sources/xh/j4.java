package xh;

import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;
public final class j4 extends g.p {
    public final l4 f45943c;

    public j4(l4 l4Var) {
        this.f45943c = l4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.f45943c;
        nz nzVar = l4Var.f45978a0;
        w51 w51Var = l4Var.f45982e0;
        if (w51Var == null) {
            return nzVar.J;
        }
        i51 G = w51Var.G(i10 - 1);
        if (G != null && (i11 = G.f24903u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
