package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements bh.k {
    public final int f43537a;
    public final org.telegram.ui.Components.j71 f43538b;

    public x8(org.telegram.ui.Components.j71 j71Var, int i10) {
        this.f43537a = i10;
        this.f43538b = j71Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f43537a) {
            case 0:
            default:
                return this.f43538b.drawChild(canvas, view, j10);
        }
    }
}
