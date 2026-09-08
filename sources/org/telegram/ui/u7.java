package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class u7 extends FrameLayout {
    public final int f40978a;
    public int f40979b;
    public final NotificationCenter.NotificationCenterDelegate f40980c;

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f40978a = i10;
        this.f40980c = notificationCenterDelegate;
        this.f40979b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f40978a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f40979b != measuredWidth) {
                    this.f40979b = measuredWidth;
                    ((h8) this.f40980c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f40979b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    qq qqVar = (qq) this.f40980c;
                    qqVar.f39963b.x0(qqVar.V - 1);
                }
                this.f40979b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f40979b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) this.f40980c;
                    z20Var.f33094w = false;
                    z20Var.a();
                }
                this.f40979b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f40978a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f40979b = -1;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public u7(h8 h8Var, Context context) {
        super(context);
        this.f40978a = 0;
        this.f40980c = h8Var;
    }
}
