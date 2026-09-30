package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class rs implements ah.m {
    public final int f37552a;
    public final org.telegram.ui.Components.zl0 f37553b;

    public rs(org.telegram.ui.Components.zl0 zl0Var, int i10) {
        this.f37552a = i10;
        this.f37553b = zl0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f37552a) {
            case 0:
            default:
                return this.f37553b.drawChild(canvas, view, j3);
        }
    }
}
