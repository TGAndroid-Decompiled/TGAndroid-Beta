package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements ah.n {
    public final int f39410a;
    public final Object f39411b;

    public x8(Object obj, int i10) {
        this.f39410a = i10;
        this.f39411b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f39410a) {
            case 0:
                return ((org.telegram.ui.Components.f61) this.f39411b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f39411b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f31255a.drawChild(canvas, view, j3);
            default:
                return ((dg1) this.f39411b).drawChild(canvas, view, j3);
        }
    }
}
