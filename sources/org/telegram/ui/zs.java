package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zs extends org.telegram.ui.ActionBar.o1 {
    public final bt f46354o;

    public zs(bt btVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f46354o = btVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ft ftVar = this.f46354o.f38155a;
        ftVar.f39455k = null;
        ftVar.K = false;
        if (ftVar.R) {
            ftVar.l();
        }
    }
}
