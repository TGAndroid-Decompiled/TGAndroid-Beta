package org.telegram.ui;
public final class u71 extends org.telegram.ui.Components.j71 {
    public final c81 f42295g3;

    public u71(c81 c81Var, c81 c81Var2, f5 f5Var, s71 s71Var, s71 s71Var2) {
        super(c81Var2, f5Var, s71Var, s71Var2);
        this.f42295g3 = c81Var;
    }

    @Override
    public final float getSectionsEdgeTop() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.o2) this.f42295g3).actionBar;
        return kVar.getHeight();
    }
}
