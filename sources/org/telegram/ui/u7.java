package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class u7 extends FrameLayout {

    public final int f43147a;

    public int f43148b;

    public final NotificationCenter.NotificationCenterDelegate f43149c;

    public u7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f43147a = i10;
        this.f43149c = notificationCenterDelegate;
        this.f43148b = -1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f43147a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f43148b != measuredWidth) {
                    this.f43148b = measuredWidth;
                    ((h8) this.f43149c).H.l();
                }
                break;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f43148b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    dq dqVar = (dq) this.f43149c;
                    dqVar.f37492b.x0(dqVar.R - 1);
                }
                this.f43148b = i14;
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f43148b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) this.f43149c;
                    n20Var.f30827w = false;
                    n20Var.a();
                }
                this.f43148b = i16;
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f43147a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f43148b = -1;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    public u7(h8 h8Var, Context context) {
        super(context);
        this.f43147a = 0;
        this.f43149c = h8Var;
    }
}
