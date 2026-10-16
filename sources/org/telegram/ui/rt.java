package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rt extends org.telegram.ui.ActionBar.m1 {
    public final tt f39583o;

    public rt(tt ttVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f39583o = ttVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        xt xtVar = this.f39583o.f40207a;
        xtVar.f41646k = null;
        xtVar.K = false;
        if (xtVar.R) {
            xtVar.n();
        }
    }
}
