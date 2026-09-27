package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class x7 extends FrameLayout {
    public final int f39546a;
    public int f39547b;
    public final NotificationCenter.NotificationCenterDelegate f39548c;

    public x7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f39546a = i10;
        this.f39548c = notificationCenterDelegate;
        this.f39547b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f39546a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f39547b != measuredWidth) {
                    this.f39547b = measuredWidth;
                    ((k8) this.f39548c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f39547b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    lq lqVar = (lq) this.f39548c;
                    lqVar.f35405b.y0(lqVar.V - 1);
                }
                this.f39547b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f39547b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.c30 c30Var = (org.telegram.ui.Components.c30) this.f39548c;
                    c30Var.f23209w = false;
                    c30Var.a();
                }
                this.f39547b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f39546a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f39547b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public x7(k8 k8Var, Context context) {
        super(context);
        this.f39546a = 0;
        this.f39548c = k8Var;
    }
}
