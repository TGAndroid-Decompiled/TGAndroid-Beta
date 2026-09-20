package xh;

import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;
public final class z0 extends g.p {
    public final r1 f46520c;

    public z0(r1 r1Var) {
        this.f46520c = r1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r1 r1Var = this.f46520c;
        nz nzVar = r1Var.f46396j0;
        k61 k61Var = r1Var.Y;
        if (k61Var != null && i10 != 0) {
            w51 G = k61Var.G(i10 - 1);
            if (G != null && (i11 = G.f29957u) != -1) {
                return i11;
            }
            return nzVar.J;
        }
        return nzVar.J;
    }
}
