package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements og.j {
    public final int f42954a;
    public final Object f42955b;

    public x8(Object obj, int i10) {
        this.f42954a = i10;
        this.f42955b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f42954a) {
            case 0:
                return ((org.telegram.ui.Components.h61) this.f42955b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f42955b;
                if (view == profileActivity.L) {
                    return true;
                }
                return profileActivity.f34560a.drawChild(canvas, view, j10);
            default:
                return ((qf1) this.f42955b).drawChild(canvas, view, j10);
        }
    }
}
