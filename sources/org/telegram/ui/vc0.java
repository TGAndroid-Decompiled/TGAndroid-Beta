package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vc0 extends org.telegram.ui.ActionBar.n1 {
    public final dd0 f38351o;

    public vc0(dd0 dd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38351o = dd0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f38351o.I0 = null;
    }
}
