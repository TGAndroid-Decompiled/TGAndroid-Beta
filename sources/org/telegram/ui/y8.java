package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class y8 implements bh.k {
    public final int f42068a;
    public final Object f42069b;

    public y8(Object obj, int i10) {
        this.f42068a = i10;
        this.f42069b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f42068a) {
            case 0:
                return ((org.telegram.ui.Components.h71) this.f42069b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f42069b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f32528a.drawChild(canvas, view, j10);
            default:
                return ((jg1) this.f42069b).drawChild(canvas, view, j10);
        }
    }
}
