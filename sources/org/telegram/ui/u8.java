package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class u8 implements ig.j {
    public final int f43162a;
    public final Object f43163b;

    public u8(Object obj, int i9) {
        this.f43162a = i9;
        this.f43163b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f43162a) {
            case 0:
                return ((org.telegram.ui.Components.i51) this.f43163b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f43163b;
                if (view == profileActivity.K) {
                    return true;
                }
                return profileActivity.f35918a.drawChild(canvas, view, j10);
            default:
                return ((ue1) this.f43163b).drawChild(canvas, view, j10);
        }
    }
}
