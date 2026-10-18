package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class x8 implements bh.k {
    public final int f43042a;
    public final Object f43043b;

    public x8(Object obj, int i10) {
        this.f43042a = i10;
        this.f43043b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f43042a) {
            case 0:
                return ((org.telegram.ui.Components.a71) this.f43043b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f43043b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f33575a.drawChild(canvas, view, j10);
            default:
                return ((re1) this.f43043b).drawChild(canvas, view, j10);
        }
    }
}
