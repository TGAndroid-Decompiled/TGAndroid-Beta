package org.telegram.ui;
public final class w10 extends org.telegram.ui.Components.vf0 {
    public final x30 f50665t1;

    public w10(x30 x30Var, LaunchActivity launchActivity, u20 u20Var, f30 f30Var, v10 v10Var) {
        super(launchActivity, u20Var, f30Var, v10Var);
        this.f50665t1 = x30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f50665t1.f28586b.invalidate();
    }
}
