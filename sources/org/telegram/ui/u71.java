package org.telegram.ui;
public final class u71 extends g.o {
    public final w71 f42374c;

    public u71(w71 w71Var) {
        this.f42374c = w71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        w71 w71Var = this.f42374c;
        org.telegram.ui.Components.e00 e00Var = w71Var.X;
        org.telegram.ui.Components.e71 e71Var = w71Var.f43234d0;
        if (e71Var == null) {
            return e00Var.J;
        }
        org.telegram.ui.Components.r61 G = e71Var.G(i10 - 1);
        if (G != null && (i11 = G.f30370u) != -1) {
            return i11;
        }
        return e00Var.J;
    }
}
