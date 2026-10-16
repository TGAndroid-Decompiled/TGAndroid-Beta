package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class st extends org.telegram.ui.ActionBar.m1 {
    public final tt f39943o;

    public st(tt ttVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f39943o = ttVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        xt xtVar = this.f39943o.f40207a;
        xtVar.f41646k = null;
        xtVar.K = false;
        if (xtVar.R) {
            xtVar.n();
        }
    }
}
