package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements bh.k {
    public final int f43497a;
    public final org.telegram.ui.Components.i71 f43498b;

    public x8(org.telegram.ui.Components.i71 i71Var, int i10) {
        this.f43497a = i10;
        this.f43498b = i71Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f43497a) {
            case 0:
            default:
                return this.f43498b.drawChild(canvas, view, j10);
        }
    }
}
