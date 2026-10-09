package org.telegram.ui;
public final class v71 extends g.o {
    public final x71 f42672c;

    public v71(x71 x71Var) {
        this.f42672c = x71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        x71 x71Var = this.f42672c;
        org.telegram.ui.Components.d00 d00Var = x71Var.X;
        org.telegram.ui.Components.c71 c71Var = x71Var.f43844d0;
        if (c71Var == null) {
            return d00Var.J;
        }
        org.telegram.ui.Components.p61 G = c71Var.G(i10 - 1);
        if (G != null && (i11 = G.f29743u) != -1) {
            return i11;
        }
        return d00Var.J;
    }
}
