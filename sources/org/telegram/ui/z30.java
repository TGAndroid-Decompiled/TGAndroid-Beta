package org.telegram.ui;

import android.view.ViewGroup;
public final class z30 extends org.telegram.ui.Components.wh0 {
    public final e60 f40391p1;

    public z30(e60 e60Var, LaunchActivity launchActivity, b50 b50Var, l50 l50Var, y30 y30Var) {
        super(launchActivity, b50Var, l50Var, y30Var);
        this.f40391p1 = e60Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f40391p1).containerView;
        viewGroup.invalidate();
    }
}
