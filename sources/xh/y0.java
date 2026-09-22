package xh;

import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.w51;
public final class y0 extends g.p {
    public final q1 f46202c;

    public y0(q1 q1Var) {
        this.f46202c = q1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        q1 q1Var = this.f46202c;
        nz nzVar = q1Var.f46081j0;
        w51 w51Var = q1Var.Y;
        if (w51Var != null && i10 != 0) {
            i51 G = w51Var.G(i10 - 1);
            if (G != null && (i11 = G.f24909u) != -1) {
                return i11;
            }
            return nzVar.J;
        }
        return nzVar.J;
    }
}
