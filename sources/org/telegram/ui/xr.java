package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class xr {
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f40057a;
    public org.telegram.ui.ActionBar.c1 f40058b;
    public org.telegram.ui.ActionBar.g1[] f40059c;

    public final void a(float f10, boolean z4) {
        org.telegram.ui.ActionBar.g1[] g1VarArr = this.f40059c;
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            if (z4 && ((i10 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
                g1VarArr[i10].c(-9718023, -9718023);
            } else {
                g1VarArr[i10].c(-328966, -328966);
            }
        }
        this.f40058b.d(f10, true);
    }
}
