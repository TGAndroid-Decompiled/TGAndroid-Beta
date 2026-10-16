package yh;

import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.zz;
public final class i4 extends g.o {
    public final k4 f48920c;

    public i4(k4 k4Var) {
        this.f48920c = k4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k4 k4Var = this.f48920c;
        zz zzVar = k4Var.f48943a0;
        a71 a71Var = k4Var.f48947e0;
        if (a71Var == null) {
            return zzVar.J;
        }
        m61 G = a71Var.G(i10 - 1);
        if (G != null && (i11 = G.f26955u) != -1) {
            return i11;
        }
        return zzVar.J;
    }
}
