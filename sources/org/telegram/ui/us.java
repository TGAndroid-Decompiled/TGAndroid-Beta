package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class us implements og.j {
    public final int f41923a;
    public final org.telegram.ui.Components.sl0 f41924b;

    public us(org.telegram.ui.Components.sl0 sl0Var, int i10) {
        this.f41923a = i10;
        this.f41924b = sl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f41923a) {
            case 0:
            default:
                return this.f41924b.drawChild(canvas, view, j10);
        }
    }
}
