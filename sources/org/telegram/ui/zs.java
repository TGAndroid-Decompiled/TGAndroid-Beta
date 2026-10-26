package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zs extends org.telegram.ui.ActionBar.o1 {
    public final bt f46357o;

    public zs(bt btVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f46357o = btVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ft ftVar = this.f46357o.f38158a;
        ftVar.f39458k = null;
        ftVar.K = false;
        if (ftVar.R) {
            ftVar.l();
        }
    }
}
