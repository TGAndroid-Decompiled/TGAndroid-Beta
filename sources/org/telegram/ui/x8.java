package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements og.j {
    public final int f42993a;
    public final Object f42994b;

    public x8(Object obj, int i10) {
        this.f42993a = i10;
        this.f42994b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f42993a) {
            case 0:
                return ((org.telegram.ui.Components.i61) this.f42994b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f42994b;
                if (view == profileActivity.L) {
                    return true;
                }
                return profileActivity.f34560a.drawChild(canvas, view, j10);
            default:
                return ((kf1) this.f42994b).drawChild(canvas, view, j10);
        }
    }
}
