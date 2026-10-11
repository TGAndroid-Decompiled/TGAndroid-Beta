package org.telegram.ui;

import android.view.View;
public final class tw extends org.telegram.ui.Components.st {
    public final ry E;

    public tw(oy oyVar, ry ryVar) {
        super(oyVar);
        this.E = ryVar;
    }

    @Override
    public final void y() {
        ry ryVar = this.E;
        if (ryVar.f41566c.L0() == 0) {
            View m10 = ryVar.f41566c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (ryVar.v == 2) {
                ryVar.v = 1;
            }
            yw ywVar = ryVar.f41569n;
            if (ywVar != null) {
                ywVar.b();
            }
        }
    }
}
