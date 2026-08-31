package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class us implements og.j {
    public final int f42029a;
    public final org.telegram.ui.Components.tl0 f42030b;

    public us(org.telegram.ui.Components.tl0 tl0Var, int i10) {
        this.f42029a = i10;
        this.f42030b = tl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f42029a) {
            case 0:
            default:
                return this.f42030b.drawChild(canvas, view, j10);
        }
    }
}
