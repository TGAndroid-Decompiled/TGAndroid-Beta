package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class t7 extends FrameLayout {
    public final int f41925a;
    public int f41926b;
    public final NotificationCenter.NotificationCenterDelegate f41927c;

    public t7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f41925a = i10;
        this.f41927c = notificationCenterDelegate;
        this.f41926b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41925a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f41926b != measuredWidth) {
                    this.f41926b = measuredWidth;
                    ((g8) this.f41927c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f41926b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    nq nqVar = (nq) this.f41927c;
                    nqVar.f40358b.x0(nqVar.V - 1);
                }
                this.f41926b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f41926b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.r30 r30Var = (org.telegram.ui.Components.r30) this.f41927c;
                    r30Var.f30365w = false;
                    r30Var.a();
                }
                this.f41926b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f41925a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f41926b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public t7(g8 g8Var, Context context) {
        super(context);
        this.f41925a = 0;
        this.f41927c = g8Var;
    }
}
