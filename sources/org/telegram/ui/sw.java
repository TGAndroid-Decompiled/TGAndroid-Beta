package org.telegram.ui;

import android.view.View;
public final class sw extends org.telegram.ui.Components.xs {
    public final py E;

    public sw(my myVar, py pyVar) {
        super(myVar);
        this.E = pyVar;
    }

    @Override
    public final void y() {
        py pyVar = this.E;
        if (pyVar.f37248c.L0() == 0) {
            View m9 = pyVar.f37248c.m(0);
            if (m9 != null) {
                m9.invalidate();
            }
            if (pyVar.v == 2) {
                pyVar.v = 1;
            }
            xw xwVar = pyVar.f37250n;
            if (xwVar != null) {
                xwVar.b();
            }
        }
    }
}
