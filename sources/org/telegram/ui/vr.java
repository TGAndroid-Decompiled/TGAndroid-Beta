package org.telegram.ui;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vr {
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f39237a;
    public org.telegram.ui.ActionBar.c1 f39238b;
    public org.telegram.ui.ActionBar.g1[] f39239c;

    public final void a(float f10, boolean z4) {
        org.telegram.ui.ActionBar.g1[] g1VarArr = this.f39239c;
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            if (z4 && ((i10 == 0 && Math.abs(f10 - 0.2f) < 0.01f) || ((i10 == 1 && Math.abs(f10 - 0.5f) < 0.1f) || ((i10 == 2 && Math.abs(f10 - 1.0f) < 0.1f) || ((i10 == 3 && Math.abs(f10 - 1.5f) < 0.1f) || (i10 == 4 && Math.abs(f10 - 2.0f) < 0.1f)))))) {
                g1VarArr[i10].c(-9718023, -9718023);
            } else {
                g1VarArr[i10].c(-328966, -328966);
            }
        }
        this.f39238b.d(f10, true);
    }
}
