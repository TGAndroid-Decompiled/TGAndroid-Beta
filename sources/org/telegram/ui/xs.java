package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class xs implements bh.k {
    public final int f42883a;
    public final org.telegram.ui.Components.ll0 f42884b;

    public xs(org.telegram.ui.Components.ll0 ll0Var, int i10) {
        this.f42883a = i10;
        this.f42884b = ll0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f42883a) {
            case 0:
            default:
                return this.f42884b.drawChild(canvas, view, j3);
        }
    }
}
