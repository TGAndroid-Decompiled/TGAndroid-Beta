package org.telegram.ui;

import android.view.View;
public final class rw extends org.telegram.ui.Components.ct {
    public final sy E;

    public rw(py pyVar, sy syVar) {
        super(pyVar);
        this.E = syVar;
    }

    @Override
    public final void y() {
        sy syVar = this.E;
        if (syVar.f37595c.L0() == 0) {
            View m10 = syVar.f37595c.m(0);
            if (m10 != null) {
                m10.invalidate();
            }
            if (syVar.v == 2) {
                syVar.v = 1;
            }
            ww wwVar = syVar.f37597n;
            if (wwVar != null) {
                wwVar.b();
            }
        }
    }
}
