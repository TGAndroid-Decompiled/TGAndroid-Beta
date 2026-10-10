package org.telegram.ui;

import android.view.View;
public final class uw extends org.telegram.ui.Components.st {
    public final sy E;

    public uw(py pyVar, sy syVar) {
        super(pyVar);
        this.E = syVar;
    }

    @Override
    public final void y() {
        sy syVar = this.E;
        if (syVar.f41836c.L0() == 0) {
            View m10 = syVar.f41836c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (syVar.v == 2) {
                syVar.v = 1;
            }
            zw zwVar = syVar.f41839n;
            if (zwVar != null) {
                zwVar.b();
            }
        }
    }
}
