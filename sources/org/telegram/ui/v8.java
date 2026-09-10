package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class v8 implements zg.j {
    public final int f37444a;
    public final Object f37445b;

    public v8(Object obj, int i10) {
        this.f37444a = i10;
        this.f37445b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f37444a) {
            case 0:
                return ((org.telegram.ui.Components.r61) this.f37445b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f37445b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f30350a.drawChild(canvas, view, j3);
            default:
                return ((gg1) this.f37445b).drawChild(canvas, view, j3);
        }
    }
}
