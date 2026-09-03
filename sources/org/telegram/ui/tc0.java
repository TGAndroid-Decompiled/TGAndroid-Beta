package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class tc0 extends org.telegram.ui.ActionBar.p1 {
    public final bd0 f41507o;

    public tc0(bd0 bd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f41507o = bd0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f41507o.F0 = null;
    }
}
