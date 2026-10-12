package org.telegram.ui;
public final class y71 extends g.o {
    public final a81 f44324c;

    public y71(a81 a81Var) {
        this.f44324c = a81Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        a81 a81Var = this.f44324c;
        org.telegram.ui.Components.g00 g00Var = a81Var.X;
        org.telegram.ui.Components.h71 h71Var = a81Var.f35729d0;
        if (h71Var == null) {
            return g00Var.J;
        }
        org.telegram.ui.Components.u61 G = h71Var.G(i10 - 1);
        if (G != null && (i11 = G.f31080u) != -1) {
            return i11;
        }
        return g00Var.J;
    }
}
