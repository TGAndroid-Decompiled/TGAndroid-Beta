package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class u8 implements ah.m {
    public final int f42362a;
    public final Object f42363b;

    public u8(Object obj, int i10) {
        this.f42362a = i10;
        this.f42363b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f42362a) {
            case 0:
                return ((org.telegram.ui.Components.k71) this.f42363b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f42363b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f34211a.drawChild(canvas, view, j3);
            default:
                return ((dg1) this.f42363b).drawChild(canvas, view, j3);
        }
    }
}
