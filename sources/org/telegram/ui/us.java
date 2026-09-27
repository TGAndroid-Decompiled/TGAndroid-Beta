package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class us implements ah.m {
    public final int f38314a;
    public final Object f38315b;

    public us(Object obj, int i10) {
        this.f38314a = i10;
        this.f38315b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f38314a) {
            case 0:
                return ((org.telegram.ui.Components.yl0) this.f38315b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f38315b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f31526a.drawChild(canvas, view, j3);
            default:
                return ((uf1) this.f38315b).drawChild(canvas, view, j3);
        }
    }
}
