package org.telegram.ui;

import android.view.View;
public final class tw extends org.telegram.ui.Components.dt {
    public final ty E;

    public tw(qy qyVar, ty tyVar) {
        super(qyVar);
        this.E = tyVar;
    }

    @Override
    public final void y() {
        ty tyVar = this.E;
        if (tyVar.f40992c.L0() == 0) {
            View m10 = tyVar.f40992c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (tyVar.v == 2) {
                tyVar.v = 1;
            }
            yw ywVar = tyVar.f40995n;
            if (ywVar != null) {
                ywVar.b();
            }
        }
    }
}
