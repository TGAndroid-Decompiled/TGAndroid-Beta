package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class u8 implements ah.m {
    public final int f42406a;
    public final Object f42407b;

    public u8(Object obj, int i10) {
        this.f42406a = i10;
        this.f42407b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f42406a) {
            case 0:
                return ((org.telegram.ui.Components.l71) this.f42407b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f42407b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f34249a.drawChild(canvas, view, j3);
            default:
                return ((dg1) this.f42407b).drawChild(canvas, view, j3);
        }
    }
}
