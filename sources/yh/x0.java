package yh;

import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.wz;
public final class x0 extends g.o {
    public final o1 f50571c;

    public x0(o1 o1Var) {
        this.f50571c = o1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        o1 o1Var = this.f50571c;
        wz wzVar = o1Var.f50431j0;
        s61 s61Var = o1Var.Y;
        if (s61Var != null && i10 != 0) {
            f61 G = s61Var.G(i10 - 1);
            if (G != null && (i11 = G.f26149u) != -1) {
                return i11;
            }
            return wzVar.J;
        }
        return wzVar.J;
    }
}
