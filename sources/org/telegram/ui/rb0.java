package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rb0 extends org.telegram.ui.ActionBar.k1 {
    public final yb0 f41193o;

    public rb0(yb0 yb0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f41193o = yb0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f41193o.Q0 = null;
    }
}
