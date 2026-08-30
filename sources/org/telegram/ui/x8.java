package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements ng.j {
    public final int f39873a;
    public final Object f39874b;

    public x8(Object obj, int i10) {
        this.f39873a = i10;
        this.f39874b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f39873a) {
            case 0:
                return ((org.telegram.ui.Components.g61) this.f39874b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f39874b;
                if (view == profileActivity.L) {
                    return true;
                }
                return profileActivity.f32028a.drawChild(canvas, view, j10);
            default:
                return ((if1) this.f39874b).drawChild(canvas, view, j10);
        }
    }
}
