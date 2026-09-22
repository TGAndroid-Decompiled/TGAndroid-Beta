package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class xs implements ah.n {
    public final int f39747a;
    public final org.telegram.ui.Components.yl0 f39748b;

    public xs(org.telegram.ui.Components.yl0 yl0Var, int i10) {
        this.f39747a = i10;
        this.f39748b = yl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f39747a) {
            case 0:
            default:
                return this.f39748b.drawChild(canvas, view, j3);
        }
    }
}
