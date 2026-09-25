package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class rs implements ah.m {
    public final int f37460a;
    public final org.telegram.ui.Components.wl0 f37461b;

    public rs(org.telegram.ui.Components.wl0 wl0Var, int i10) {
        this.f37460a = i10;
        this.f37461b = wl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f37460a) {
            case 0:
            default:
                return this.f37461b.drawChild(canvas, view, j3);
        }
    }
}
