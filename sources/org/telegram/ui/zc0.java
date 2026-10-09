package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zc0 extends org.telegram.ui.ActionBar.n1 {
    public final hd0 f44547o;

    public zc0(hd0 hd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f44547o = hd0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f44547o.I0 = null;
    }
}
