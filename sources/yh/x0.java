package yh;

import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.uz;
public final class x0 extends g.o {
    public final o1 f51037c;

    public x0(o1 o1Var) {
        this.f51037c = o1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        o1 o1Var = this.f51037c;
        uz uzVar = o1Var.f50897j0;
        a71 a71Var = o1Var.Y;
        if (a71Var != null && i10 != 0) {
            l61 G = a71Var.G(i10 - 1);
            if (G != null && (i11 = G.f28236u) != -1) {
                return i11;
            }
            return uzVar.J;
        }
        return uzVar.J;
    }
}
