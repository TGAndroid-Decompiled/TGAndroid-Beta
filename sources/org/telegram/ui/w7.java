package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class w7 extends FrameLayout {
    public final int f42363a;
    public int f42364b;
    public final NotificationCenter.NotificationCenterDelegate f42365c;

    public w7(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10) {
        super(context);
        this.f42363a = i10;
        this.f42365c = notificationCenterDelegate;
        this.f42364b = -1;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f42363a) {
            case 0:
                super.onLayout(z4, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.f42364b != measuredWidth) {
                    this.f42364b = measuredWidth;
                    ((j8) this.f42365c).I.l();
                    return;
                }
                return;
            case 1:
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.f42364b;
                if (i15 != -1 && Math.abs(i15 - i14) > AndroidUtilities.dp(20.0f)) {
                    kq kqVar = (kq) this.f42365c;
                    kqVar.f38367b.x0(kqVar.S - 1);
                }
                this.f42364b = i14;
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                Point point = AndroidUtilities.displaySize;
                int i16 = point.x + point.y;
                int i17 = this.f42364b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.c30 c30Var = (org.telegram.ui.Components.c30) this.f42365c;
                    c30Var.f25757w = false;
                    c30Var.a();
                }
                this.f42364b = i16;
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f42363a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.f42364b = -1;
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
        this.f42363a = 0;
        this.f42365c = j8Var;
    }
}
