package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class sc0 extends org.telegram.ui.ActionBar.p1 {
    public final ad0 f38294o;

    public sc0(ad0 ad0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f38294o = ad0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f38294o.F0 = null;
    }
}
