package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class yc0 extends org.telegram.ui.ActionBar.m1 {
    public final gd0 f44319o;

    public yc0(gd0 gd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f44319o = gd0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f44319o.I0 = null;
    }
}
