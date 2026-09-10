package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ys implements zg.j {
    public final int f39109a;
    public final org.telegram.ui.Components.vl0 f39110b;

    public ys(org.telegram.ui.Components.vl0 vl0Var, int i10) {
        this.f39109a = i10;
        this.f39110b = vl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f39109a) {
            case 0:
            default:
                return this.f39110b.drawChild(canvas, view, j3);
        }
    }
}
