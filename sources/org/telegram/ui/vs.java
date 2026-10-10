package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class vs implements ah.m {
    public final int f43019a;
    public final org.telegram.ui.Components.rm0 f43020b;

    public vs(org.telegram.ui.Components.rm0 rm0Var, int i10) {
        this.f43019a = i10;
        this.f43020b = rm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f43019a) {
            case 0:
            default:
                return this.f43020b.drawChild(canvas, view, j3);
        }
    }
}
