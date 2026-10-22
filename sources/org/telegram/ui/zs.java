package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zs extends org.telegram.ui.ActionBar.m1 {
    public final at f43802o;

    public zs(at atVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f43802o = atVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        et etVar = this.f43802o.f35419a;
        etVar.f36789k = null;
        etVar.K = false;
        if (etVar.R) {
            etVar.n();
        }
    }
}
