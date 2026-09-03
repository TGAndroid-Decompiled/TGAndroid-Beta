package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class z8 implements ng.j {
    public final int f40422a;
    public final Object f40423b;

    public z8(Object obj, int i10) {
        this.f40422a = i10;
        this.f40423b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f40422a) {
            case 0:
                return ((org.telegram.ui.Components.g61) this.f40423b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f40423b;
                if (view == profileActivity.L) {
                    return true;
                }
                return profileActivity.f32002a.drawChild(canvas, view, j10);
            default:
                return ((qf1) this.f40423b).drawChild(canvas, view, j10);
        }
    }
}
