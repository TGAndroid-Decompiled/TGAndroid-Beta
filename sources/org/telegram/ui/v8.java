package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class v8 implements ah.m {
    public final int f38387a;
    public final Object f38388b;

    public v8(Object obj, int i10) {
        this.f38387a = i10;
        this.f38388b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f38387a) {
            case 0:
                return ((org.telegram.ui.Components.e61) this.f38388b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f38388b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f31238a.drawChild(canvas, view, j3);
            default:
                return ((bg1) this.f38388b).drawChild(canvas, view, j3);
        }
    }
}
