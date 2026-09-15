package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class xs implements ah.m {
    public final int f39671a;
    public final org.telegram.ui.Components.ll0 f39672b;

    public xs(org.telegram.ui.Components.ll0 ll0Var, int i10) {
        this.f39671a = i10;
        this.f39672b = ll0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f39671a) {
            case 0:
            default:
                return this.f39672b.drawChild(canvas, view, j3);
        }
    }
}
