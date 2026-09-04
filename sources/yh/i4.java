package yh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.v51;
public final class i4 extends g.p {
    public final k4 f50334c;

    public i4(k4 k4Var) {
        this.f50334c = k4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k4 k4Var = this.f50334c;
        nz nzVar = k4Var.f50381a0;
        v51 v51Var = k4Var.f50385e0;
        if (v51Var == null) {
            return nzVar.J;
        }
        h51 G = v51Var.G(i10 - 1);
        if (G != null && (i11 = G.f26603u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
