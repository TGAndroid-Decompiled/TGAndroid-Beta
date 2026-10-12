package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class y7 extends FrameLayout {
    public final int f42054a;
    public int f42055b;
    public final NotificationCenter.NotificationCenterDelegate f42056c;

    public y7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f42054a = i10;
        this.f42056c = notificationCenterDelegate;
        this.f42055b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f42054a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f42055b != measuredWidth) {
                    this.f42055b = measuredWidth;
                    ((l8) this.f42056c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f42055b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    tq tqVar = (tq) this.f42056c;
                    tqVar.f40436b.x0(tqVar.V - 1);
                }
                this.f42055b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f42055b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) this.f42056c;
                    m30Var.f27187w = false;
                    m30Var.a();
                }
                this.f42055b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f42054a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f42055b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public y7(l8 l8Var, Context context) {
        super(context);
        this.f42054a = 0;
        this.f42056c = l8Var;
    }
}
