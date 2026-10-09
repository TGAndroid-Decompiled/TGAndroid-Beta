package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class vs implements ah.m {
    public final int f42973a;
    public final org.telegram.ui.Components.qm0 f42974b;

    public vs(org.telegram.ui.Components.qm0 qm0Var, int i10) {
        this.f42973a = i10;
        this.f42974b = qm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f42973a) {
            case 0:
            default:
                return this.f42974b.drawChild(canvas, view, j3);
        }
    }
}
