package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements bh.k {
    public final int f43128a;
    public final Object f43129b;

    public x8(Object obj, int i10) {
        this.f43128a = i10;
        this.f43129b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f43128a) {
            case 0:
                return ((org.telegram.ui.Components.b71) this.f43129b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f43129b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f33574a.drawChild(canvas, view, j10);
            default:
                return ((pe1) this.f43129b).drawChild(canvas, view, j10);
        }
    }
}
