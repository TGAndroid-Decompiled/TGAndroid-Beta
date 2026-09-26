package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class v8 implements ah.m {
    public final int f38662a;
    public final Object f38663b;

    public v8(Object obj, int i10) {
        this.f38662a = i10;
        this.f38663b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f38662a) {
            case 0:
                return ((org.telegram.ui.Components.r61) this.f38663b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f38663b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f31524a.drawChild(canvas, view, j3);
            default:
                return ((uf1) this.f38663b).drawChild(canvas, view, j3);
        }
    }
}
