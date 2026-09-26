package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class rs implements ah.m {
    public final int f37459a;
    public final org.telegram.ui.Components.wl0 f37460b;

    public rs(org.telegram.ui.Components.wl0 wl0Var, int i10) {
        this.f37459a = i10;
        this.f37460b = wl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f37459a) {
            case 0:
            default:
                return this.f37460b.drawChild(canvas, view, j3);
        }
    }
}
