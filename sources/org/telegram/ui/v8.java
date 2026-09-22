package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class v8 implements ah.m {
    public final int f38390a;
    public final Object f38391b;

    public v8(Object obj, int i10) {
        this.f38390a = i10;
        this.f38391b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f38390a) {
            case 0:
                return ((org.telegram.ui.Components.e61) this.f38391b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f38391b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f31235a.drawChild(canvas, view, j3);
            default:
                return ((cg1) this.f38391b).drawChild(canvas, view, j3);
        }
    }
}
