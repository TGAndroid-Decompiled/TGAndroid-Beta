package xh;

import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.p61;
public final class a1 extends g.o {
    public final r1 f51164c;

    public a1(r1 r1Var) {
        this.f51164c = r1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r1 r1Var = this.f51164c;
        d00 d00Var = r1Var.f51488j0;
        c71 c71Var = r1Var.Y;
        if (c71Var != null && i10 != 0) {
            p61 G = c71Var.G(i10 - 1);
            if (G != null && (i11 = G.f29743u) != -1) {
                return i11;
            }
            return d00Var.J;
        }
        return d00Var.J;
    }
}
