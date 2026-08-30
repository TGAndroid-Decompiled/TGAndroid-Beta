package org.telegram.ui;

import android.view.ViewGroup;
public final class x30 extends org.telegram.ui.Components.vh0 {
    public final c60 f39851p1;

    public x30(c60 c60Var, LaunchActivity launchActivity, z40 z40Var, j50 j50Var, w30 w30Var) {
        super(launchActivity, z40Var, j50Var, w30Var);
        this.f39851p1 = c60Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f39851p1).containerView;
        viewGroup.invalidate();
    }
}
