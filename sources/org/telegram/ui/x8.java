package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements bh.k {
    public final int f43006a;
    public final Object f43007b;

    public x8(Object obj, int i10) {
        this.f43006a = i10;
        this.f43007b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f43006a) {
            case 0:
                return ((org.telegram.ui.Components.a71) this.f43007b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f43007b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f33568a.drawChild(canvas, view, j10);
            default:
                return ((re1) this.f43007b).drawChild(canvas, view, j10);
        }
    }
}
