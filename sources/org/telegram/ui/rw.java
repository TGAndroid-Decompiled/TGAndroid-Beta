package org.telegram.ui;

import android.view.View;
public final class rw extends org.telegram.ui.Components.bt {
    public final py E;

    public rw(my myVar, py pyVar) {
        super(myVar);
        this.E = pyVar;
    }

    @Override
    public final void y() {
        py pyVar = this.E;
        if (pyVar.f36696c.L0() == 0) {
            View m10 = pyVar.f36696c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (pyVar.v == 2) {
                pyVar.v = 1;
            }
            ww wwVar = pyVar.f36698n;
            if (wwVar != null) {
                wwVar.b();
            }
        }
    }
}
