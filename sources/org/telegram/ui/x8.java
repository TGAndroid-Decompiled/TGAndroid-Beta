package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements bh.k {
    public final int f43133a;
    public final Object f43134b;

    public x8(Object obj, int i10) {
        this.f43133a = i10;
        this.f43134b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f43133a) {
            case 0:
                return ((org.telegram.ui.Components.c71) this.f43134b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f43134b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f33581a.drawChild(canvas, view, j10);
            default:
                return ((pe1) this.f43134b).drawChild(canvas, view, j10);
        }
    }
}
