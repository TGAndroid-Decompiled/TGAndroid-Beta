package org.telegram.ui;

import android.view.View;
public final class vw extends org.telegram.ui.Components.at {
    public final ty E;

    public vw(qy qyVar, ty tyVar) {
        super(qyVar);
        this.E = tyVar;
    }

    @Override
    public final void y() {
        ty tyVar = this.E;
        if (tyVar.f37828c.L0() == 0) {
            View m10 = tyVar.f37828c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (tyVar.v == 2) {
                tyVar.v = 1;
            }
            ax axVar = tyVar.f37830n;
            if (axVar != null) {
                axVar.b();
            }
        }
    }
}
