package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ys extends org.telegram.ui.ActionBar.o1 {
    public final bt f46103o;

    public ys(bt btVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f46103o = btVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ft ftVar = this.f46103o.f38158a;
        ftVar.f39458k = null;
        ftVar.K = false;
        if (ftVar.R) {
            ftVar.l();
        }
        View view = ftVar.h;
        if (view != null) {
            if (view instanceof org.telegram.ui.Cells.i8) {
                ((org.telegram.ui.Cells.i8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.g8) {
                ((org.telegram.ui.Cells.g8) view).setScaled(false);
            } else if (view instanceof org.telegram.ui.Cells.d2) {
                ((org.telegram.ui.Cells.d2) view).setScaled(false);
            }
            ftVar.h = null;
        }
    }
}
