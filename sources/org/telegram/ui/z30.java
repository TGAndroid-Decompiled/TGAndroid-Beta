package org.telegram.ui;

import android.view.ViewGroup;
public final class z30 extends org.telegram.ui.Components.ph0 {
    public final f60 f39954s1;

    public z30(f60 f60Var, LaunchActivity launchActivity, b50 b50Var, l50 l50Var, y30 y30Var) {
        super(launchActivity, b50Var, l50Var, y30Var);
        this.f39954s1 = f60Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f39954s1).containerView;
        viewGroup.invalidate();
    }
}
