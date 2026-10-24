package org.telegram.ui;
public final class t71 extends org.telegram.ui.Components.i71 {
    public final b81 f41896g3;

    public t71(b81 b81Var, b81 b81Var2, f5 f5Var, r71 r71Var, r71 r71Var2) {
        super(b81Var2, f5Var, r71Var, r71Var2);
        this.f41896g3 = b81Var;
    }

    @Override
    public final float getSectionsEdgeTop() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.f41896g3).actionBar;
        return kVar.getHeight();
    }
}
