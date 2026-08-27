package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;

public final class v8 implements jg.j {

    public final int f43376a;

    public final Object f43377b;

    public v8(Object obj, int i10) {
        this.f43376a = i10;
        this.f43377b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f43376a) {
            case 0:
                return ((org.telegram.ui.Components.k51) this.f43377b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f43377b;
                if (view == profileActivity.K) {
                    return true;
                }
                return profileActivity.f35921a.drawChild(canvas, view, j10);
            default:
                return ((ue1) this.f43377b).drawChild(canvas, view, j10);
        }
    }
}
