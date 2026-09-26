package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class uc0 extends org.telegram.ui.ActionBar.m1 {
    public final cd0 f38428o;

    public uc0(cd0 cd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38428o = cd0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f38428o.I0 = null;
    }
}
