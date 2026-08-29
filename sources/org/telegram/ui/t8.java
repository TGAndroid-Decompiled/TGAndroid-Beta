package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class t8 implements lg.j {
    public final int f42574a;
    public final Object f42575b;

    public t8(Object obj, int i10) {
        this.f42574a = i10;
        this.f42575b = obj;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.f42574a) {
            case 0:
                return ((org.telegram.ui.Components.u51) this.f42575b).drawChild(canvas, view, j10);
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.f42575b;
                if (view == profileActivity.K) {
                    return true;
                }
                return profileActivity.f35984a.drawChild(canvas, view, j10);
            default:
                return ((xe1) this.f42575b).drawChild(canvas, view, j10);
        }
    }
}
