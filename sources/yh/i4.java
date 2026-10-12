package yh;

import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zz;
public final class i4 extends g.o {
    public final k4 f48921c;

    public i4(k4 k4Var) {
        this.f48921c = k4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k4 k4Var = this.f48921c;
        zz zzVar = k4Var.f48944a0;
        z61 z61Var = k4Var.f48948e0;
        if (z61Var == null) {
            return zzVar.J;
        }
        l61 G = z61Var.G(i10 - 1);
        if (G != null && (i11 = G.f26963u) != -1) {
            return i11;
        }
        return zzVar.J;
    }
}
