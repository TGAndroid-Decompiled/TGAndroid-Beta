package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements bh.k {
    public final int f43127a;
    public final Object f43128b;

    public x8(Object obj, int i10) {
        this.f43127a = i10;
        this.f43128b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f43127a) {
            case 0:
                return ((org.telegram.ui.Components.b71) this.f43128b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f43128b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f33574a.drawChild(canvas, view, j10);
            default:
                return ((pe1) this.f43128b).drawChild(canvas, view, j10);
        }
    }
}
