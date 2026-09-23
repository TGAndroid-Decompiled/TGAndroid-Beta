package org.telegram.ui;

import android.view.View;
public final class sw extends org.telegram.ui.Components.bt {
    public final qy E;

    public sw(ny nyVar, qy qyVar) {
        super(nyVar);
        this.E = qyVar;
    }

    @Override
    public final void y() {
        qy qyVar = this.E;
        if (qyVar.f36631c.L0() == 0) {
            View m10 = qyVar.f36631c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (qyVar.v == 2) {
                qyVar.v = 1;
            }
            xw xwVar = qyVar.f36633n;
            if (xwVar != null) {
                xwVar.b();
            }
        }
    }
}
