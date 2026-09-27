package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class xc0 extends org.telegram.ui.ActionBar.o1 {
    public final fd0 f39603o;

    public xc0(fd0 fd0Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f39603o = fd0Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.f39603o.I0 = null;
    }
}
