package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class y7 extends FrameLayout {
    public final int f40167a;
    public int f40168b;
    public final NotificationCenter.NotificationCenterDelegate f40169c;

    public y7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f40167a = i10;
        this.f40169c = notificationCenterDelegate;
        this.f40168b = -1;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f40167a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f40168b != measuredWidth) {
                    this.f40168b = measuredWidth;
                    ((l8) this.f40169c).I.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f40168b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    lq lqVar = (lq) this.f40169c;
                    lqVar.f35865b.x0(lqVar.S - 1);
                }
                this.f40168b = i14;
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f40168b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.b30 b30Var = (org.telegram.ui.Components.b30) this.f40169c;
                    b30Var.f23539w = false;
                    b30Var.a();
                }
                this.f40168b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f40167a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f40168b = -1;
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
        this.f40167a = 0;
        this.f40169c = l8Var;
    }
}
