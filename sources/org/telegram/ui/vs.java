package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class vs implements ng.j {
    public final int f39182a;
    public final org.telegram.ui.Components.rl0 f39183b;

    public vs(org.telegram.ui.Components.rl0 rl0Var, int i10) {
        this.f39182a = i10;
        this.f39183b = rl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f39182a) {
            case 0:
            default:
                return this.f39183b.drawChild(canvas, view, j10);
        }
    }
}
