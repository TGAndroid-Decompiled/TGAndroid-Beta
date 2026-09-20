package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class xs implements ah.n {
    public final int f39727a;
    public final org.telegram.ui.Components.vl0 f39728b;

    public xs(org.telegram.ui.Components.vl0 vl0Var, int i10) {
        this.f39727a = i10;
        this.f39728b = vl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f39727a) {
            case 0:
            default:
                return this.f39728b.drawChild(canvas, view, j3);
        }
    }
}
