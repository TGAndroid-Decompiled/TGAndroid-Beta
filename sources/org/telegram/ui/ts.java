package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class ts implements ng.j {
    public final int f38733a;
    public final org.telegram.ui.Components.sl0 f38734b;

    public ts(org.telegram.ui.Components.sl0 sl0Var, int i10) {
        this.f38733a = i10;
        this.f38734b = sl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f38733a) {
            case 0:
            default:
                return this.f38734b.drawChild(canvas, view, j10);
        }
    }
}
