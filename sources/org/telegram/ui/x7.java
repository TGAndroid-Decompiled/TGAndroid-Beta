package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class x7 extends FrameLayout {
    public final int f43484a;
    public int f43485b;
    public final NotificationCenter.NotificationCenterDelegate f43486c;

    public x7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f43484a = i10;
        this.f43486c = notificationCenterDelegate;
        this.f43485b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f43484a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f43485b != measuredWidth) {
                    this.f43485b = measuredWidth;
                    ((k8) this.f43486c).L.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f43485b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    dq dqVar = (dq) this.f43486c;
                    dqVar.f36666b.x0(dqVar.W - 1);
                }
                this.f43485b = i14;
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f43485b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.g30 g30Var = (org.telegram.ui.Components.g30) this.f43486c;
                    g30Var.f26547w = false;
                    g30Var.a();
                }
                this.f43485b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f43484a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f43485b = -1;
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
        this.f43484a = 0;
        this.f43486c = k8Var;
    }
}
