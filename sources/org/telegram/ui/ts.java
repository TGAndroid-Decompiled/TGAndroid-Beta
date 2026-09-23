package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ts implements ah.m {
    public final int f37750a;
    public final org.telegram.ui.Components.ml0 f37751b;

    public ts(org.telegram.ui.Components.ml0 ml0Var, int i10) {
        this.f37750a = i10;
        this.f37751b = ml0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f37750a) {
            case 0:
            default:
                return this.f37751b.drawChild(canvas, view, j3);
        }
    }
}
