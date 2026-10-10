package org.telegram.ui;
public final class v71 extends g.o {
    public final x71 f42718c;

    public v71(x71 x71Var) {
        this.f42718c = x71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        x71 x71Var = this.f42718c;
        org.telegram.ui.Components.e00 e00Var = x71Var.X;
        org.telegram.ui.Components.d71 d71Var = x71Var.f43890d0;
        if (d71Var == null) {
            return e00Var.J;
        }
        org.telegram.ui.Components.q61 G = d71Var.G(i10 - 1);
        if (G != null && (i11 = G.f30072u) != -1) {
            return i11;
        }
        return e00Var.J;
    }
}
