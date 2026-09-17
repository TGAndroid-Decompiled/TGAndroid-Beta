package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class xs implements bh.k {
    public final int f42911a;
    public final org.telegram.ui.Components.ll0 f42912b;

    public xs(org.telegram.ui.Components.ll0 ll0Var, int i10) {
        this.f42911a = i10;
        this.f42912b = ll0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f42911a) {
            case 0:
            default:
                return this.f42912b.drawChild(canvas, view, j3);
        }
    }
}
