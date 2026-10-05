package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class vs implements ah.m {
    public final int f41814a;
    public final Object f41815b;

    public vs(Object obj, int i10) {
        this.f41814a = i10;
        this.f41815b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f41814a) {
            case 0:
                return ((org.telegram.ui.Components.zl0) this.f41815b).drawChild(canvas, view, j3);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f41815b;
                if (view == profileActivity.O) {
                    return true;
                }
                return profileActivity.f34221a.drawChild(canvas, view, j3);
            default:
                return ((uf1) this.f41815b).drawChild(canvas, view, j3);
        }
    }
}
