package org.telegram.ui;
public final class u71 extends g.o {
    public final w71 f42408c;

    public u71(w71 w71Var) {
        this.f42408c = w71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        w71 w71Var = this.f42408c;
        org.telegram.ui.Components.e00 e00Var = w71Var.X;
        org.telegram.ui.Components.d71 d71Var = w71Var.f43268d0;
        if (d71Var == null) {
            return e00Var.J;
        }
        org.telegram.ui.Components.q61 G = d71Var.G(i10 - 1);
        if (G != null && (i11 = G.f30176u) != -1) {
            return i11;
        }
        return e00Var.J;
    }
}
