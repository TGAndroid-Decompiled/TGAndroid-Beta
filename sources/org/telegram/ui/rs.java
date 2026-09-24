package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class rs implements ah.m {
    public final int f37444a;
    public final org.telegram.ui.Components.wl0 f37445b;

    public rs(org.telegram.ui.Components.wl0 wl0Var, int i10) {
        this.f37444a = i10;
        this.f37445b = wl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f37444a) {
            case 0:
            default:
                return this.f37445b.drawChild(canvas, view, j3);
        }
    }
}
