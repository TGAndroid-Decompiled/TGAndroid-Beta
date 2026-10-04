package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class vs implements ah.m {
    public final int f41808a;
    public final Object f41809b;

    public vs(Object obj, int i10) {
        this.f41808a = i10;
        this.f41809b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f41808a) {
            case 0:
                return ((org.telegram.ui.Components.zl0) this.f41809b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f41809b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f34201a.drawChild(canvas, view, j3);
            default:
                return ((wf1) this.f41809b).drawChild(canvas, view, j3);
        }
    }
}
