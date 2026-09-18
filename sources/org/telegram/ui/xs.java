package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class xs implements ah.n {
    public final int f39622a;
    public final org.telegram.ui.Components.wl0 f39623b;

    public xs(org.telegram.ui.Components.wl0 wl0Var, int i10) {
        this.f39622a = i10;
        this.f39623b = wl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f39622a) {
            case 0:
            default:
                return this.f39623b.drawChild(canvas, view, j3);
        }
    }
}
