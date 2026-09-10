package org.telegram.ui;

import android.view.View;
public final class xw extends org.telegram.ui.Components.gt {
    public final vy E;

    public xw(sy syVar, vy vyVar) {
        super(syVar);
        this.E = vyVar;
    }

    @Override
    public final void y() {
        vy vyVar = this.E;
        if (vyVar.f37647c.L0() == 0) {
            View m10 = vyVar.f37647c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (vyVar.v == 2) {
                vyVar.v = 1;
            }
            cx cxVar = vyVar.f37649n;
            if (cxVar != null) {
                cxVar.b();
            }
        }
    }
}
