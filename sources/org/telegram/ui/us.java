package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class us implements ah.m {
    public final int f42795a;
    public final org.telegram.ui.Components.rm0 f42796b;

    public us(org.telegram.ui.Components.rm0 rm0Var, int i10) {
        this.f42795a = i10;
        this.f42796b = rm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f42795a) {
            case 0:
            default:
                return this.f42796b.drawChild(canvas, view, j3);
        }
    }
}
