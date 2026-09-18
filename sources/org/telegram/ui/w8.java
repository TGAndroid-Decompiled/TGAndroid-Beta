package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class w8 implements ah.n {
    public final int f38715a;
    public final Object f38716b;

    public w8(Object obj, int i10) {
        this.f38715a = i10;
        this.f38716b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f38715a) {
            case 0:
                return ((org.telegram.ui.Components.t61) this.f38716b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f38716b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f31482a.drawChild(canvas, view, j3);
            default:
                return ((bg1) this.f38716b).drawChild(canvas, view, j3);
        }
    }
}
