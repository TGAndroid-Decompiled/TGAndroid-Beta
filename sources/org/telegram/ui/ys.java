package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ys implements ah.m {
    public final int f44557a;
    public final org.telegram.ui.Components.wm0 f44558b;

    public ys(org.telegram.ui.Components.wm0 wm0Var, int i10) {
        this.f44557a = i10;
        this.f44558b = wm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f44557a) {
            case 0:
            default:
                return this.f44558b.drawChild(canvas, view, j3);
        }
    }
}
