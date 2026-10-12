package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class qt extends org.telegram.ui.ActionBar.m1 {
    public final tt f39534o;

    public qt(tt ttVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f39534o = ttVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        xt xtVar = this.f39534o.f40483a;
        xtVar.f41942k = null;
        xtVar.K = false;
        if (xtVar.R) {
            xtVar.n();
        }
        View view = xtVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.f8) {
                ((org.telegram.ui.Cells.f8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d8) {
                ((org.telegram.ui.Cells.d8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            xtVar.h = null;
        }
    }
}
