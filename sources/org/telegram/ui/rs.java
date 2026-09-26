package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class rs implements ah.m {
    public final int f37458a;
    public final org.telegram.ui.Components.xl0 f37459b;

    public rs(org.telegram.ui.Components.xl0 xl0Var, int i10) {
        this.f37458a = i10;
        this.f37459b = xl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f37458a) {
            case 0:
            default:
                return this.f37459b.drawChild(canvas, view, j3);
        }
    }
}
