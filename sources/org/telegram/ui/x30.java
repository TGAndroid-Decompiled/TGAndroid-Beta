package org.telegram.ui;

import android.view.ViewGroup;
public final class x30 extends org.telegram.ui.Components.zh0 {
    public final d60 f39798s1;

    public x30(d60 d60Var, LaunchActivity launchActivity, z40 z40Var, j50 j50Var, w30 w30Var) {
        super(launchActivity, z40Var, j50Var, w30Var);
        this.f39798s1 = d60Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f39798s1).containerView;
        viewGroup.invalidate();
    }
}
