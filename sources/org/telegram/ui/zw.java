package org.telegram.ui;

import android.view.View;
public final class zw extends org.telegram.ui.Components.ot {
    public final xy E;

    public zw(uy uyVar, xy xyVar) {
        super(uyVar);
        this.E = xyVar;
    }

    @Override
    public final void y() {
        xy xyVar = this.E;
        if (xyVar.f41982c.L0() == 0) {
            View m10 = xyVar.f41982c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (xyVar.v == 2) {
                xyVar.v = 1;
            }
            ex exVar = xyVar.f41984n;
            if (exVar != null) {
                exVar.b();
            }
        }
    }
}
