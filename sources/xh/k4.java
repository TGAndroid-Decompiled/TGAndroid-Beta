package xh;

import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.q61;
public final class k4 extends g.o {
    public final m4 f51447c;

    public k4(m4 m4Var) {
        this.f51447c = m4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.f51447c;
        e00 e00Var = m4Var.f51498a0;
        d71 d71Var = m4Var.f51502e0;
        if (d71Var == null) {
            return e00Var.J;
        }
        q61 G = d71Var.G(i10 - 1);
        if (G != null && (i11 = G.f30176u) != -1) {
            return i11;
        }
        return e00Var.J;
    }
}
