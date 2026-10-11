package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class t8 implements ah.m {
    public final int f42151a;
    public final Object f42152b;

    public t8(Object obj, int i10) {
        this.f42151a = i10;
        this.f42152b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f42151a) {
            case 0:
                return ((org.telegram.ui.Components.l71) this.f42152b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f42152b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f34273a.drawChild(canvas, view, j3);
            default:
                return ((cg1) this.f42152b).drawChild(canvas, view, j3);
        }
    }
}
