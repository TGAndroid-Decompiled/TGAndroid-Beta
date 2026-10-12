package org.telegram.ui;

import android.view.View;
public final class ww extends org.telegram.ui.Components.tt {
    public final uy E;

    public ww(ry ryVar, uy uyVar) {
        super(ryVar);
        this.E = uyVar;
    }

    @Override
    public final void y() {
        uy uyVar = this.E;
        if (uyVar.f42613c.L0() == 0) {
            View m10 = uyVar.f42613c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (uyVar.v == 2) {
                uyVar.v = 1;
            }
            bx bxVar = uyVar.f42616n;
            if (bxVar != null) {
                bxVar.b();
            }
        }
    }
}
