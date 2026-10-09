package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class u8 implements ah.m {
    public final int f42360a;
    public final Object f42361b;

    public u8(Object obj, int i10) {
        this.f42360a = i10;
        this.f42361b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f42360a) {
            case 0:
                return ((org.telegram.ui.Components.k71) this.f42361b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f42361b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f34211a.drawChild(canvas, view, j3);
            default:
                return ((dg1) this.f42361b).drawChild(canvas, view, j3);
        }
    }
}
