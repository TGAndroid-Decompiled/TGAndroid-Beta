package org.telegram.ui;

import android.view.View;
public final class xu extends org.telegram.ui.Components.es {
    public final tw E;

    public xu(pw pwVar, tw twVar) {
        super(pwVar);
        this.E = twVar;
    }

    @Override
    public final void y() {
        tw twVar = this.E;
        if (twVar.f49899c.L0() == 0) {
            View m10 = twVar.f49899c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (twVar.f49905w == 2) {
                twVar.f49905w = 1;
            }
            cv cvVar = twVar.f49902n;
            if (cvVar != null) {
                cvVar.b();
            }
        }
    }
}
