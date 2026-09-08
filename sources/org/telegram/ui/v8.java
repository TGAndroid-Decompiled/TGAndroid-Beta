package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class v8 implements bh.k {
    public final int f41472a;
    public final Object f41473b;

    public v8(Object obj, int i10) {
        this.f41472a = i10;
        this.f41473b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f41472a) {
            case 0:
                return ((org.telegram.ui.Components.d61) this.f41473b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f41473b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f33883a.drawChild(canvas, view, j3);
            default:
                return ((cg1) this.f41473b).drawChild(canvas, view, j3);
        }
    }
}
