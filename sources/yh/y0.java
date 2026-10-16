package yh;

import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.zz;
public final class y0 extends g.o {
    public final p1 f49221c;

    public y0(p1 p1Var) {
        this.f49221c = p1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        p1 p1Var = this.f49221c;
        zz zzVar = p1Var.f49065j0;
        a71 a71Var = p1Var.Y;
        if (a71Var != null && i10 != 0) {
            m61 G = a71Var.G(i10 - 1);
            if (G != null && (i11 = G.f26955u) != -1) {
                return i11;
            }
            return zzVar.J;
        }
        return zzVar.J;
    }
}
