package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class us implements ah.m {
    public final int f42761a;
    public final org.telegram.ui.Components.sm0 f42762b;

    public us(org.telegram.ui.Components.sm0 sm0Var, int i10) {
        this.f42761a = i10;
        this.f42762b = sm0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f42761a) {
            case 0:
            default:
                return this.f42762b.drawChild(canvas, view, j3);
        }
    }
}
