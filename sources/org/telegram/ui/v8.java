package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class v8 implements ah.m {
    public final int f38661a;
    public final Object f38662b;

    public v8(Object obj, int i10) {
        this.f38661a = i10;
        this.f38662b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f38661a) {
            case 0:
                return ((org.telegram.ui.Components.s61) this.f38662b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f38662b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f31523a.drawChild(canvas, view, j3);
            default:
                return ((uf1) this.f38662b).drawChild(canvas, view, j3);
        }
    }
}
