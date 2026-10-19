package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class xs extends org.telegram.ui.ActionBar.m1 {
    public final at f43255o;

    public xs(at atVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f43255o = atVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        et etVar = this.f43255o.f35425a;
        etVar.f36785k = null;
        etVar.K = false;
        if (etVar.R) {
            etVar.n();
        }
        View view = etVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.e8) {
                ((org.telegram.ui.Cells.e8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.c8) {
                ((org.telegram.ui.Cells.c8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.f2) {
                ((org.telegram.ui.Cells.f2) view).setScaled(false);
            }
            etVar.h = null;
        }
    }
}
