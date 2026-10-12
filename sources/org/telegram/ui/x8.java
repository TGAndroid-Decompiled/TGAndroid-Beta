package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements ah.m {
    public final int f43803a;
    public final Object f43804b;

    public x8(Object obj, int i10) {
        this.f43803a = i10;
        this.f43804b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f43803a) {
            case 0:
                return ((org.telegram.ui.Components.p71) this.f43804b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f43804b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f34050a.drawChild(canvas, view, j3);
            default:
                return ((fg1) this.f43804b).drawChild(canvas, view, j3);
        }
    }
}
