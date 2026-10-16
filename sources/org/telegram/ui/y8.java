package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class y8 implements bh.k {
    public final int f41771a;
    public final Object f41772b;

    public y8(Object obj, int i10) {
        this.f41771a = i10;
        this.f41772b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f41771a) {
            case 0:
                return ((org.telegram.ui.Components.i71) this.f41772b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f41772b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f32230a.drawChild(canvas, view, j10);
            default:
                return ((ig1) this.f41772b).drawChild(canvas, view, j10);
        }
    }
}
