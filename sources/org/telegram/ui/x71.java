package org.telegram.ui;
public final class x71 extends g.p {
    public final z71 f38602c;

    public x71(z71 z71Var) {
        this.f38602c = z71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        z71 z71Var = this.f38602c;
        org.telegram.ui.Components.uz uzVar = z71Var.X;
        org.telegram.ui.Components.j61 j61Var = z71Var.f39226d0;
        if (j61Var == null) {
            return uzVar.J;
        }
        org.telegram.ui.Components.v51 G = j61Var.G(i10 - 1);
        if (G != null && (i11 = G.f27838u) != -1) {
            return i11;
        }
        return uzVar.J;
    }
}
