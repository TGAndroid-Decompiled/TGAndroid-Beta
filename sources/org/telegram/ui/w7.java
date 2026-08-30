package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class w7 extends FrameLayout {
    public final int f39354a;
    public int f39355b;
    public final NotificationCenter.NotificationCenterDelegate f39356c;

    public w7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f39354a = i10;
        this.f39356c = notificationCenterDelegate;
        this.f39355b = -1;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f39354a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f39355b != measuredWidth) {
                    this.f39355b = measuredWidth;
                    ((j8) this.f39356c).I.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f39355b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    jq jqVar = (jq) this.f39356c;
                    jqVar.f35432b.x0(jqVar.S - 1);
                }
                this.f39355b = i14;
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f39355b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.a30 a30Var = (org.telegram.ui.Components.a30) this.f39356c;
                    a30Var.f23286w = false;
                    a30Var.a();
                }
                this.f39355b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f39354a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f39355b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public w7(j8 j8Var, Context context) {
        super(context);
        this.f39354a = 0;
        this.f39356c = j8Var;
    }
}
