package org.telegram.ui;

import android.view.View;
public final class rw extends org.telegram.ui.Components.at {
    public final oy E;

    public rw(ly lyVar, oy oyVar) {
        super(lyVar);
        this.E = oyVar;
    }

    @Override
    public final void y() {
        oy oyVar = this.E;
        if (oyVar.f39868c.L0() == 0) {
            View m9 = oyVar.f39868c.m(0);
            if (m9 != null) {
                m9.invalidate();
            }
            if (oyVar.v == 2) {
                oyVar.v = 1;
            }
            ww wwVar = oyVar.f39871n;
            if (wwVar != null) {
                wwVar.b();
            }
        }
    }
}
