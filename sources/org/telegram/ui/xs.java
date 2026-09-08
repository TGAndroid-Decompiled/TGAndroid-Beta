package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class xs implements bh.k {
    public final int f42910a;
    public final org.telegram.ui.Components.ll0 f42911b;

    public xs(org.telegram.ui.Components.ll0 ll0Var, int i10) {
        this.f42910a = i10;
        this.f42911b = ll0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f42910a) {
            case 0:
            default:
                return this.f42911b.drawChild(canvas, view, j3);
        }
    }
}
