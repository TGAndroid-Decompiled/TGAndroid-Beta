package org.telegram.ui;

import android.view.View;
public final class qw extends org.telegram.ui.Components.ys {
    public final ny E;

    public qw(ky kyVar, ny nyVar) {
        super(kyVar);
        this.E = nyVar;
    }

    @Override
    public final void y() {
        ny nyVar = this.E;
        if (nyVar.f36743c.L0() == 0) {
            View m9 = nyVar.f36743c.m(0);
            if (m9 != null) {
                m9.invalidate();
            }
            if (nyVar.v == 2) {
                nyVar.v = 1;
            }
            vw vwVar = nyVar.f36745n;
            if (vwVar != null) {
                vwVar.b();
            }
        }
    }
}
