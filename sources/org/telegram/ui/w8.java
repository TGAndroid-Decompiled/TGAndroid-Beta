package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class w8 implements ah.n {
    public final int f38694a;
    public final Object f38695b;

    public w8(Object obj, int i10) {
        this.f38694a = i10;
        this.f38695b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f38694a) {
            case 0:
                return ((org.telegram.ui.Components.s61) this.f38695b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f38695b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f31522a.drawChild(canvas, view, j3);
            default:
                return ((dg1) this.f38695b).drawChild(canvas, view, j3);
        }
    }
}
