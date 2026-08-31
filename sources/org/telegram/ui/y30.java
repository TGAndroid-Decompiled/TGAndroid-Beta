package org.telegram.ui;

import android.view.ViewGroup;
public final class y30 extends org.telegram.ui.Components.xh0 {
    public final d60 f43541p1;

    public y30(d60 d60Var, LaunchActivity launchActivity, a50 a50Var, k50 k50Var, x30 x30Var) {
        super(launchActivity, a50Var, k50Var, x30Var);
        this.f43541p1 = d60Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f43541p1).containerView;
        viewGroup.invalidate();
    }
}
