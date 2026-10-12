package yh;

import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zz;
public final class y0 extends g.o {
    public final p1 f49222c;

    public y0(p1 p1Var) {
        this.f49222c = p1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        p1 p1Var = this.f49222c;
        zz zzVar = p1Var.f49066j0;
        z61 z61Var = p1Var.Y;
        if (z61Var != null && i10 != 0) {
            l61 G = z61Var.G(i10 - 1);
            if (G != null && (i11 = G.f26963u) != -1) {
                return i11;
            }
            return zzVar.J;
        }
        return zzVar.J;
    }
}
