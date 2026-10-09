package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class vs implements ah.m {
    public final int f42975a;
    public final org.telegram.ui.Components.qm0 f42976b;

    public vs(org.telegram.ui.Components.qm0 qm0Var, int i10) {
        this.f42975a = i10;
        this.f42976b = qm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f42975a) {
            case 0:
            default:
                return this.f42976b.drawChild(canvas, view, j3);
        }
    }
}
