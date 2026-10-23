package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ys extends org.telegram.ui.ActionBar.m1 {
    public final at f43549o;

    public ys(at atVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f43549o = atVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        et etVar = this.f43549o.f35420a;
        etVar.f36790k = null;
        etVar.K = false;
        if (etVar.R) {
            etVar.n();
        }
    }
}
